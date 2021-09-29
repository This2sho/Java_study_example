package Thread;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Customer5 implements Runnable{
    private Table5 table;
    private String food;

    Customer5(Table5 table, String food){
        this.table = table;
        this.food = food;
    }
    @Override
    public void run(){
        while(true){
            try{Thread.sleep(100);} catch(InterruptedException e){}
            String name = Thread.currentThread().getName();

            table.remove(food);
            System.out.println(name + " ate a " + food);
        }
    }
}

class Cook5 implements Runnable {
    private Table5 table;

    Cook5(Table5 table){this.table = table;}

    @Override
    public void run(){
        while(true){
            int idx = (int)(Math.random()*table.dishNum());
            table.add(table.dishNames[idx]);

            try{Thread.sleep(10);} catch(InterruptedException e){}
        }
    }
}

class Table5{
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;

    private ArrayList<String> dishes = new ArrayList<>();

    private ReentrantLock lock = new ReentrantLock();
    private Condition forCook = lock.newCondition();
    private Condition forDonut = lock.newCondition();
    private Condition forBurger = lock.newCondition();

    public void add(String dish){
        lock.lock();
        try{
            while(dishes.size() >= MAX_FOOD){
                String name = Thread.currentThread().getName();
                System.out.println(name + " is wating.");
                try{
                    forCook.await(); //wait();
                    Thread.sleep(500);
                }catch(InterruptedException e){}
            }
            dishes.add(dish);
            if(dish.equals("donut")) {
                forDonut.signal();
            }else{
                forBurger.signal();
            }

            System.out.println("Dishes : " + dishes.toString());
        } finally {
            lock.unlock();
        }
    }

    public void remove(String dishName){
        lock.lock();//synchronized(this){
        String name = Thread.currentThread().getName();
        try{
            while(dishes.size() == 0){
                System.out.println(name+" is wationg.");
                try{
                    forDonut.await();
                    forBurger.await();//forCust.await();
                    Thread.sleep(500);
                } catch(InterruptedException e){}
            }
            while(true){
                for(int i=0; i<dishes.size(); i++){
                    if(dishName.equals(dishes.get(i))){
                        dishes.remove(i);
                        forCook.signal();//notify();
                        return;
                    }
                }
                try{
                    System.out.println(name + " is waiting.");
                    forBurger.await();
                    forDonut.await();//forCust.await();//wait();
                    Thread.sleep(500);
                }catch(InterruptedException e) {}
            }
        }finally{
            lock.unlock();
        }
    }
    public int dishNum() {return dishNames.length;}
}

public class ThreadWaitEx5 {
    public static void main(String[] args) throws Exception {
        Table5 table = new Table5();

        new Thread(new Cook5(table), "COOK1").start();
        new Thread(new Customer5(table, "donut"), "CUST1").start();
        new Thread(new Customer5(table, "burger"), "CUST2").start();

        Thread.sleep(2000);
        System.exit(0);
    }
}
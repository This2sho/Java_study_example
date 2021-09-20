package Generics;

import java.util.*;

class Juice {
    String name;

    Juice(String name){
        this.name = name + "Juice";
    }
    public String toString(){
        return name;
    }
}

class Juicer{
    static Juice makeJuice(FruitBox<? extends Fruit2> box){
        String tmp = "";

        for(Fruit2 f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}

public class FruitBoxEx3 {
    public static void main(String[] args){
        FruitBox<Fruit2> fruitBox = new FruitBox<Fruit2>();
        FruitBox<Apple2> appleBox = new FruitBox<>();

        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());

        appleBox.add(new Apple2());
        appleBox.add(new Apple2());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}

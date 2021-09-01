package Polymorphism;

class Product {
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv extends Product{
    Tv(){
        super(100);
    }
    public String toString() {return "TV";}
}

class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString() {return "Computer";}
}

class Buyer{
    int money = 250;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price){
            System.out.println("u don't enough money");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "buy");
    }
}
public class PolyArgumentTest {
    public static void main(String args[]){
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());
    }
}

package Generics;

import java.util.*;


class Fruit2 implements Eatable {public String toString(){return "Fruit";}}
class Apple2 extends Fruit2 {public String toString(){return "Apple";}}
class Grape2 extends Fruit2 {public String toString(){return "Grape";}}
class Toy2 {public String toString(){return "Toy";}}

interface Eatable{}

public class FruitBoxEx2 {
    public static void main(String[] args){
        FruitBox<Fruit2> fruitBox = new FruitBox<Fruit2>();
        FruitBox<Apple2> appleBox = new FruitBox<>();
        FruitBox<Grape2> grapeBox = new FruitBox<>();

        fruitBox.add(new Fruit2());
        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());

        appleBox.add(new Apple2());
        grapeBox.add(new Grape2());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}

class FruitBox<T extends Fruit2 & Eatable> extends Box2<T> {}

class Box2<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {list.add(item);}
    T get(int i) {return list.get(i);}
    ArrayList<T> getList() {return list;}
    int size() {return list.size();}
    public String toString() {return list.toString();}
}
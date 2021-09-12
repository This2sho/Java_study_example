package CollectionFrameWork;

import java.util.*;

public class ListIteratirEx1 {
    public static void main(String[] args){
        ArrayList al = new ArrayList<>();

        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");

        // listIterator(idx) 안의 매개변수로 호출되는 it결정
        ListIterator it = al.listIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();

        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        System.out.println();
    }
    
}

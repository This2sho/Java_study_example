package CollectionFrameWork;

import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args){
        HashMap map = new HashMap<>();
        map.put("javakim", 100);
        map.put("javalee", 100);
        map.put("javakang", 80);
        map.put("javaan", 90);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("name : " + e.getKey() + ", score : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("list : " + set);

        Collection value = map.values();
        it = value.iterator();

        int total = 0;

        while(it.hasNext()){
            Integer i = (Integer)it.next();
            total += i.intValue();
        }

        System.out.println("total score : " + total);
        System.out.println("average score : " + (float)total/value.size());
        System.out.println("highest score : " + Collections.max(value));
        System.out.println("lowest score : " + Collections.min(value));


    }
}

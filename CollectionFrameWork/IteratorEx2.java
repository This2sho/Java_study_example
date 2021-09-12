package CollectionFrameWork;

import java.util.*;

public class IteratorEx2 {
    public static void main(String[] args){
        ArrayList origin = new ArrayList<>(10);
        ArrayList copy1 = new ArrayList<>(10);
        ArrayList copy2 = new ArrayList<>(10);

        for(int i=0; i < 10; ++i){
            origin.add(i + "");
        }

        Iterator it = origin.iterator();

        while(it.hasNext()){
            copy1.add(it.next());
        }

        System.out.println("= Original에서 copy1로 복사(copy) =");
        System.out.println("origin:" + origin);
        System.out.println("copy1:" + copy1);
        System.out.println();
        
        it = origin.iterator();

        while(it.hasNext()){
            copy2.add(it.next());
            it.remove();
        }

        System.out.println("= Original에서 copy2로 이동(move) =");
        System.out.println("origin:" + origin);
        System.out.println("copy1:" + copy2);
        System.out.println();
        
    }
}

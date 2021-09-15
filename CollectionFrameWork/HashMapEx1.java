package CollectionFrameWork;

import java.util.*;

public class HashMapEx1 {
    public static void main(String[] args){
        HashMap map = new HashMap<>();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner s = new Scanner(System.in);

        Loop1 : while(true) {
            System.out.println("input ur id & password.");
            System.out.print("ID : ");
            String id = s.nextLine().trim();

            System.out.print("Password : ");
            String pwd = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("No ID! retry please.");
                System.out.println();
                continue Loop1;
            }
            
            if(!(map.get(id).equals(pwd))){
                System.out.println("no match password");
            } else {
                System.out.println("match!!");
                break Loop1;
            }
        }
    }
}

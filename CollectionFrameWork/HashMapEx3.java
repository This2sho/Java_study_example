package CollectionFrameWork;

import java.util.*;

public class HashMapEx3 {
    static HashMap phoneBook = new HashMap();
    public static void main(String[] args){
        addPhoneNo("friend", "javalee", "010-111-1111");
        addPhoneNo("friend", "javakim", "010-222-2222");
        addPhoneNo("friend", "javakim", "010-333-3333");
        addPhoneNo("company", "drikim", "010-444-4444");
        addPhoneNo("company", "drikim", "010-555-5555");
        addPhoneNo("company", "dripark", "010-666-6666");
        addPhoneNo("company", "zanglee", "010-777-7777");
        addPhoneNo("laundry", "010-888-8888");

        printList();
    }
    static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap group = (HashMap)phoneBook.get(groupName);
        group.put(tel, name);
    }
    static void addGroup(String groupName) {
        if(!phoneBook.containsKey(groupName)){
            phoneBook.put(groupName, new HashMap());
        }
    }

    static void addPhoneNo(String name, String tel) {
        addPhoneNo("etc.", name, tel);
    }

    static void printList(){
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();

            Set subSet = ((HashMap)e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();

            System.out.println(" * "+e.getKey()+"[" + subSet.size() + "]");
            
            while(subIt.hasNext()){
                Map.Entry subE = (Map.Entry)subIt.next();
                String telNo = (String)subE.getKey();
                String name = (String)subE.getValue();
                System.out.println(name + " " + telNo);
            }
            System.out.println();
        }
    }
}

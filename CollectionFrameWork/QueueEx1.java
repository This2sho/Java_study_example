package CollectionFrameWork;

import java.util.*;

public class QueueEx1 {
    static Queue q = new LinkedList<>();
    static final int MAX_SIZE = 5;

    public static void main(String[] args){
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while(true) {
            System.out.print(">>");
            
            try{
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if("".equals(s)) continue;

                if(input.equalsIgnoreCase("q")){
                    System.exit(0);
                }else if(input.equalsIgnoreCase("help")){
                    System.out.println("~~");
                }else if(input.equalsIgnoreCase("history")){
                    int i = 0;
                    save(input);

                    LinkedList tmp = (LinkedList) q;
                    ListIterator it = tmp.listIterator();

                    while(it.hasNext())
                        System.out.println(++i+"."+it.next());
                }else{
                    save(input);
                    System.out.println(input);
                }
            }catch(Exception e){
                System.out.println("입력오류");
            }
        }
    }

    public static void save(String input) {
        if(!"".equals(input)) 
            q.offer(input);

        if(q.size() > MAX_SIZE)
            q.remove();
    }
}

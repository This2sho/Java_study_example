package array;

class string_cli {
    public static void main(String[] args){
        System.out.println("매개변수의 개수: " +args.length);
        for(int i=0; i<args.length; ++i){
            System.out.println(i+"번째 입력 : " + args[i]);
        }
    }
}

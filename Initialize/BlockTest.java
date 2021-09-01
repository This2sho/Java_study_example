package Initialize;
/*
    클래스 초기화 블럭 : 클래스 변수의 복잡한 초기화에 사용.
    -> 클래스가 메모리에 처음 로딩될 때 한번만 수행

    인스턴스 초기화 블럭 : 인스턴스 변수의 복잡한 초기화에 사용.
    -> 클래스가 인스턴스회 될 때마다 수행.
*/
class BlockTest {
    static {
        System.out.println("static {}");
    }    

    {
        System.out.println("{ }");
    }

    public BlockTest(){
        System.out.println("생성자");
    }
    
    public static void main(String[] args){
        System.out.println("BlockTest bt = new BlockTest();");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest();");
        BlockTest bt2 = new BlockTest();

    }
}

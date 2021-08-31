class BindingTest {
    public static void main(String[] args){
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }    
}

class Parent{
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}

/*
    실행 결과를 보면
    멤버 변수의 경우는 인스턴스에 상관없이 Parent와 Child 모두 참조변수에 따라 값이 정해지는데
    이는, 초기화가 수행되는 시기와 관련있는 것 같다.
    
    생성자가 제일 마지막에 실행되는데 생성자가 실행 되기전 인스턴스 초기화의 명시적 초기화가 먼저 실행되서
    p와 c의 x값은 다르게 나오고 method의 경우 child로 실행되는게 아닐까??
    
    *클래스 초기화(기본값 -> 명시적 초기화 -> 클래스 초기화 블럭) -> 인스턴스 초기화(기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자)
    
*/

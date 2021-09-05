package Polymorphism;

/*
    자바의 정석 예제 7-27

    Interface 의 본질적인 측면
    메서드를 호출하는 User입장에서는 사용하려는 메서드(Provider)의 선언부만 알면 된다.
    이렇게 User(A)와 Provider(B)간의 관계가 만약 직접적이라면(Interface 사용x)
    Provider(B)가 변경되면 User(A)도 변경되어야 한다.
    여기서, Interface를 사용해서 간접적인 관계로 바뀐다면, B를 직접 사용하지 않고
    Interface I만 사용하여 오직 I의 영향만 받게된다.

    아래 코드는 Interface를 사용하기 전 코드이고, Interface를 사용한 코드는 
    InterfaceTest2.java에 구현.
*/
class A{
    public void methodA(B b){
        b.methodB();
    }
}


class B{
    public void methodB(){
        System.out.println("method B");
    }
}

class InterfaceTest {
    public static void main(String[] args){
        A a = new A();
        a.methodA(new B());
    }    
}

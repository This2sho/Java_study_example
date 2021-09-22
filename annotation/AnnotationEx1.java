package annotation;

class Parent{
    void parentMethod(){}
}
class Child extends Parent{
    @Override
    void parentMethod(){}
}
public class AnnotationEx1 {
    public static void main(String[] args){
        Child c = new Child();
        System.out.println("Complete~!");
    }
}

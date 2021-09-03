package Polymorphism;

/*
    자바의 정석 예제 7-25
    리턴타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미한다.
*/

interface Parseable {
    public abstract void parse(String fileName);
}

class XMLParser implements Parseable {
    public void parse(String fileName){
        System.out.println(fileName + "= XML parsing completed.");
    }
}

class HTMLParser implements Parseable {
    public void parse(String fileName){
        System.out.println(fileName + "= HTML parsing completed.");
    }
}

class ParserManager {
    public static Parseable getParser(String type) {
        if(type.equals("XML")){
            return new XMLParser();
        } else {
            return new HTMLParser();
        }
    }
}

class ParserTest {
    public static void main(String args[]){
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("doc.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("doc2.html");
    }
}

package Initialize;
class InitTest {
    static int cv = 1;
    int iv = 1;
    
    static {
        cv = 2;
    }

    {iv = 2;}

    InitTest (){
        iv = 3;
    }
}


/*
    실행순서 
    클래스 초기화                           |               인스턴스 초기화
    기본값  명시적초기화    클래스초기화블럭      |     기본값      명시적초기화    인스턴스초기화블럭      생성자
    cv=0    cv=1        cv=2            |   cv=2,iv=0   cv=2,iv=1       cv=2,iv=2     cv=2,iv=3
    1       2            3              |        4           5               6            7 
*/
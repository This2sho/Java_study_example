package array;
/*
    자바의 정석 예제 5-4
    ArrayEx4
    for문을 사용한 배열 복사 대신
    Systme.arraycopy사용
*/

class ArrayEx4{
    public static void main(String[] args){
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        
        System.out.println(abc);
        System.out.println(num);

        // abc 배열과 num 배열을 합친 배열을 만들고 싶다!
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        // 배열 abc를 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        // num의 인덱스6위치에 3개를 복사
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }
}
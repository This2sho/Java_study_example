package Stream;

import java.util.stream.*;

public class StreamTest {
    public static void main(String[] args){
        Student4[] stuArr = {
            //String name, boolean isMale, int hak, int ban, int score
            new Student4("나자바", true,  1, 1, 300),
            new Student4("이자바", true,  1, 3, 200),
            new Student4("나자바", true,  2, 1, 300),
            new Student4("김지미", false, 2, 1, 250),
            new Student4("김자바", true,  2, 1, 200),
            new Student4("이지미", false, 2, 2, 150),
            new Student4("강지미", false, 1, 3, 150),
            new Student4("남자바", true,  2, 2, 100),
            new Student4("안지미", false, 2, 2,  50),
            new Student4("황지미", false, 2, 3, 100),
            new Student4("김지미", false, 1, 1, 250),
            new Student4("김자바", true,  1, 1, 200),
            new Student4("이지미", false, 1, 2, 150),
            new Student4("남자바", true,  1, 2, 100),
            new Student4("안지미", false, 1, 2,  50),
            new Student4("황지미", false, 1, 3, 100),
            new Student4("강지미", false, 2, 3, 150),
            new Student4("이자바", true,  2, 3, 200)
        };
        
        Stream<Student4> stuStream = Stream.of(stuArr);

        System.out.printf("1. 단순그룹할(반별) %n");
        // stuStream.sorted((Student4 stu1,Student4 stu2) -> {
        //     return stu1.getBan() - stu2.getBan();
        // }).forEach(s -> System.out.println(s));

        System.out.println(stuStream.collect(Collectors.groupingBy(Student4::getBan)).values());

        System.out.printf("%n2. 단순그룹화(성적별로 그룹화) %n");

        System.out.printf("%n3. 단순그룹화 + 통계(성적별 학생수) %n");
        System.out.printf("%n4. 다중그룹화(학년별, 반별)");
        System.out.printf("%n5. 다중그룹화 + 통계(학년별, 반별 1등)%n");
        System.out.printf("%n6. 다중그룹화 + 통계(학년별, 반별 성적그룹)%n");


    }
}

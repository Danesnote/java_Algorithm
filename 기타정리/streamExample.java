package 기타정리;
import java.util.*;
import java.util.stream.*;

/**
 * java8 부터 사용가능한 Stream 문법은
 * 크게 3개의 흐름으로 사용이 가능하다.
 * 1. 생성하기
   2. 가공하기 (중개연산)
   3. 결과만들기 (최종연산)
   
 *  1. 생성하기
    - 배열 , 컬렉션, 빈스트림
    - Stream.builder() , Stream.generate() , Stream.iterate()
    - 기본타입형 , String , 파일스트림
    - 병렬스트림, 스트림연결하기
    2. 가공하기(중개연산)
    - Filtering
    - Mapping
    - Sorting
    - Iterating
    3. 결과만들기
    - Calculating
    - Reduction
    - Collecting
    - Matching
    - Iterating
 * 
 */

public class streamExample {
    public static void main(String[] args) {
        
    }

    //생성
    public void create(){
        /* 스트림은 배열 또는 컬렉션 인스턴스를 이용하여 생성
         * 
         */
        String[] strArr = {"","",""};
        Stream<String> stream = Arrays.stream(strArr);

        List<String> list = Arrays.asList("a","b","c");
        Stream<String> listStream = list.stream();
        Stream<String> parallelStream = list.parallelStream();

        Map<String,String> map = new HashMap();

        //Builder로 직접 값 삽입하는법
        Stream<String> builderStream = Stream.<String>builder()
                                    .add("hahaha").add("easy")
                                    .build();
    }




    public void listFiltering(){
        // use Stream
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
        List<String> result = names.stream()
            .filter(name -> name.startsWith("J"))
            .collect(Collectors.toList());
        System.out.println(result); // [John, Jane, Jack]

        // not use Stream
        List<String> names0 = Arrays.asList("John", "Jane", "Jack", "Doe");
        List<String> result0 = new ArrayList<>();
        for (String name : names0) {
            if (name.startsWith("J")) {
                result0.add(name);
            }
        }
        System.out.println(result0); // [John, Jane, Jack]

    }

    public void listMapping(){
        //use Stream
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> squared = numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println(squared); // [1, 4, 9, 16]
        
        //not use Stream
        List<Integer> numbers0 = Arrays.asList(1, 2, 3, 4);
        List<Integer> squared0 = new ArrayList<>();
        for (Integer n : numbers0) {
            squared0.add(n * n);
        }
        System.out.println(squared0); // [1, 4, 9, 16]

    }
}

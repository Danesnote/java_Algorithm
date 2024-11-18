package 기타정리;

import java.util.*;

public class methodExample {
    
    public static void main(String[] args) {
        //String

        String a = "practice";

        System.out.println(a.startsWith("prac")); // true
        System.out.println(a.indexOf("ct"));

        //Stringbuilder

        StringBuilder sb = new StringBuilder();
        sb.append("haha");

        sb.reverse(); // ahah

        sb.insert(0, 0); // 0ahah

        System.out.println(String.valueOf(sb));
        System.out.println(sb.toString());

        //Array

        int[] intArr = new int[] {1,3,5,2,4};

        Integer[] integerArr = Arrays.stream(intArr) // IntStream 생성
                                    .boxed() // Integer로 박싱
                                    .toArray(Integer[]::new); // Integer배열로 변환

        intArr = Arrays.stream(integerArr).mapToInt(Integer::intValue).toArray();

        Arrays.sort(intArr); // 1,2,3,4,5
        // reverseOrder 내림차순 정렬은 int[] 불가
        Arrays.sort(integerArr, Collections.reverseOrder()); // 
        
        Arrays.sort(intArr,0,4);

        String[] strArr = {"a","b"};
        //내림차순 정렬
        Arrays.sort(strArr,(o1,o2)->o2.compareTo(o1)); // o1이 더 크면 o1이 앞으로 정렬
        

        









    }

    

}

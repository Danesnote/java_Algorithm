import java.util.*;
/*0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다. */

public class practice{

    public static void main(String[] args){
        Solution solution = new Solution();
        
        String print = "";
        
        int[] numbers = {6,10,2};
        int[] numbers2 = {3,30,34,5,9};

        //print = solution.solution2(numbers2);

        System.out.print(print);

        
    }
    public static class Solution {
        public String solution2(int[] numbers) {
            String answer = "haha";
            int[] arr = 
            // 3, 30
            Arrays.sort(numbers,(o1,o2) -> (o2+o1).compareTo(o1+o2));

            //1~n자리수 별로 나누고
            //무조건 큰 1자리 수가 먼저 온다.
            //3, 30 의 경우 3이 먼저와야 한다.
            //1, 11 의 경우는 순서 상관없다.

            //1621 
            
            return answer;
        }

    
        public int[] solution1(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            int n = 0;
            
            for(int i=0; i < commands.length; i++){
                int k = 0;
                //배열 선언 (배열의 크기는 commands 1번쨰 원소 - 0번째 원소)
                int[] list = new int[commands[i][1] - commands[i][0] + 1];

                for(int j=commands[i][0];j<=commands[i][1];j++){
                    list[k++] = array[j-1];
                }
                Arrays.sort(list);
                answer[n++] = list[commands[i][2] - 1];
            }
            
            return answer;
        }

        
    }

}
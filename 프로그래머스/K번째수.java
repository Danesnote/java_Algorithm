import java.util.*;

public class K번째수{

    public static void main(String[] args){
        Solution solution = new Solution();
        
        int[] print;
        
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        print = solution.solution2(array,commands);

        for(int i : print){
            System.out.print(i);
        }
    }
    public static class Solution {
        public int[] solution2(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            //List<Integer> answer = new ArrayList<>();
            int o = 0;

            for(int[] command : commands){
                int[] list = new int[command[1]-command[0] + 1];
                int k = 0;
                
                for(int i = command[0];i<=command[1];i++){
                    list[k++] = array[i-1];
                }
                Arrays.sort(list);
                //answer =list;
                answer[o++] = list[command[2]-1];
            }
            
            
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
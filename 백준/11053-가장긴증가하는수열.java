import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine()); //수열 arr의 길이
        int[] arr = new int[n+1];  //수열 배열 초기화
        int[] seq = new int[n+1];  //만들 수 있는 수열 길이를 담은 배열 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        //수열 배열에 담기
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            seq[i] = 1;  //모든 수열 길이는 최소 1
        }
        
        //최대 수열 길이
        int max = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j]) seq[i] = Math.max(seq[i], seq[j]+1);
                // 이전 원소들 중 가장 큰 dp값 + 1
            }
            max = Math.max(max, seq[i]);  //LIS 길이 구하기
        }
        
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
		br.close();
	}	
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 스택수열_1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        Stack st = new Stack();
        ArrayList<String> ans = new ArrayList();
		int n = Integer.parseInt(br.readLine());
		
		// 입력 담을 array
		// 0을 사용하지 않기 때문에 +1을 해줌
		int[] a = new int[n + 1]; 
		// 입력 array a에서 pop할 인덱스 값
		int m = 1;
		
		// 입력 세팅
		for (int i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
        
        //스택에 1부터 쌓으면서, a 배열의 1번째 인덱스와 같으면 pop
		for (int i = 1; i <= n; i++) {
			st.push(i);
			ans.add("+");
			while (!st.empty() && st.peek().equals(a[m])) {
				st.pop();
				ans.add("-");
				m++;
			}
		}

		if (st.empty()) {
			for (String s : ans) {
				System.out.println(s);
			}
		} else {
			System.out.println("NO");
		}
		
		br.close();
	}	
}
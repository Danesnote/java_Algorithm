import java.util.Scanner;

public class 설탕배달_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int sugar = sc.nextInt();
		
		if(sugar%5 == 0) {
			System.out.println(sugar/5);
			return;
		} else {
			int five = sugar/5;
			for(int i= five; i>0; i--) {
				int tempsugar = sugar-(i*5);
				if(tempsugar %3 == 0) {
					System.out.println(i+(tempsugar/3));
					return;
				}
			}		
		}
		if(sugar%3==0) {
			System.out.println(sugar/3);
		}else {
			System.out.println(-1);
		}

		sc.close();
	}
}
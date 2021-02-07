// 구구단 출력하기
import java.util.Scanner;


public class lecture04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i);
		}
		
	}

}

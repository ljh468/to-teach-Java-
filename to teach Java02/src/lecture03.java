//  0이 입력되면 출력을 멈춰라
import java.util.Scanner;

public class lecture03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = 0;
		while(true) {
		
		if(str.charAt(n) != '0') {
			System.out.print(str.charAt(n));
		}else
			break;
		n++;
		
		}

	}
}

// 입력한 숫자부터 8단까지의 구구단 출력하기
import java.util.Scanner;

public class lecture05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		for (; i <= 8; i++) {  // for문의 초기화는 위에서 입력받기 때문에  ;로 초기화를 제외해준다
		//  for( 초기화; 조건문; 증감식 ) 구조로 이루어짐
			for (int j = 1; j <= 9; j++) { // n * 1~9까지를 하기위함
				System.out.println(i + " * " + j);
			}
			System.out.println();
			// 단이 넘어갈때 한칸 띄우기위함
		}

	}

}
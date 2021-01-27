// if문을 이용하여 점수별 학점 출력하기
// 점수는 0이상 100이하만 입력할수있다.
// 85점 이상은 A, 75점이상은 B, 65점이상은 C, 그이하는 F이다
// ex. 66 입력 -> C 학점
// ex. 90 입력 -> A 학점

import java.util.Scanner;

public class lecture03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 100 || num < 0) {
			System.out.println("다시 입력해주세요.");
		} else {
			
			if (num >= 85) {
				System.out.println("A");
			} else if (num >= 75) {
				System.out.println("B");
			} else if (num >= 65) {
				System.out.println("C");
			} else
				System.out.println("F");
		}

	}
}

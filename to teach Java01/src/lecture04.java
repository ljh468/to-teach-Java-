// 10이 만점인 정수를 입력하여 
// 10,9,8 이면 "완벽합니다.!!"
// 7,6,5이면 "잘했어요.!!"
// 4,3,2,1,0이면 "노력하세요.!!" 를 출력하시오.
import java.util.Scanner;

public class lecture04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		if (num < 0 || num > 10) {
			System.out.println("다시입력하세요.");
		}
		switch (num) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("노력하세요.!!");
			break;
		case 5:
		case 6:
		case 7:
			System.out.println("잘했어요.!!");
			break;
		case 8:
		case 9:
		case 10:
			System.out.println("완벽합니다.!!");
			break;
		}

	}

}

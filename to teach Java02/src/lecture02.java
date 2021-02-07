import java.util.Scanner;

// 입력받은 두 알파벳 사이의 모든 알파벳을 출력하기
public class lecture02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a = sc.nextLine().charAt(0);
		char b = sc.nextLine().charAt(0);
		
		for(int i = (int)a; i <= (int)b; i++) {
			System.out.print(i+" ");
		}
		
	}

}

import java.util.Scanner;

// 1부터 n까지의 합을 출력하기
public class lecture01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int n = sc.nextInt();
		int sum = 0;
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}

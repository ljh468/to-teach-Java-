import java.util.Scanner;

// �Է¹��� �� ���ĺ� ������ ��� ���ĺ��� ����ϱ�
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

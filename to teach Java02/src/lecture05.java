// �Է��� ���ں��� 8�ܱ����� ������ ����ϱ�
import java.util.Scanner;

public class lecture05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		for (; i <= 8; i++) {  // for���� �ʱ�ȭ�� ������ �Է¹ޱ� ������  ;�� �ʱ�ȭ�� �������ش�
		//  for( �ʱ�ȭ; ���ǹ�; ������ ) ������ �̷����
			for (int j = 1; j <= 9; j++) { // n * 1~9������ �ϱ�����
				System.out.println(i + " * " + j);
			}
			System.out.println();
			// ���� �Ѿ�� ��ĭ ��������
		}

	}

}
// if���� �̿��Ͽ� ������ ���� ����ϱ�
// ������ 0�̻� 100���ϸ� �Է��Ҽ��ִ�.
// 85�� �̻��� A, 75���̻��� B, 65���̻��� C, �����ϴ� F�̴�
// ex. 66 �Է� -> C ����
// ex. 90 �Է� -> A ����

import java.util.Scanner;

public class lecture03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 100 || num < 0) {
			System.out.println("�ٽ� �Է����ּ���.");
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

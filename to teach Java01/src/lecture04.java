// 10�� ������ ������ �Է��Ͽ� 
// 10,9,8 �̸� "�Ϻ��մϴ�.!!"
// 7,6,5�̸� "���߾��.!!"
// 4,3,2,1,0�̸� "����ϼ���.!!" �� ����Ͻÿ�.
import java.util.Scanner;

public class lecture04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		if (num < 0 || num > 10) {
			System.out.println("�ٽ��Է��ϼ���.");
		}
		switch (num) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("����ϼ���.!!");
			break;
		case 5:
		case 6:
		case 7:
			System.out.println("���߾��.!!");
			break;
		case 8:
		case 9:
		case 10:
			System.out.println("�Ϻ��մϴ�.!!");
			break;
		}

	}

}

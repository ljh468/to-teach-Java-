// �迭 num�� 11���� 100���� 90���� ���� ������� �迭�� �����ϰ�
// �迭�� ������� ����ϰ� �迭�� ������ ����϶�.
// ������ �����ϴ� ������ hap
// ex : num[0] : 11 
// 		num[1] : 12
//		...
//		num[89] : 100
//		���� : 4995

public class lecture04 {

	public static void main(String[]args) {
		int[] num = new int[90];
		// 90���� num�迭 ����
		int hap = 0;
		// ������ �����ϴ� ���� hap�� �ʱ�ȭ
		
		for(int i=0; i<num.length; i++) { // �ݺ����� �̿��Ͽ� 11���� 100���� �迭�� ����
			num[i] = i + 11;
			hap += num[i];
			
			// �ʱ�ȭ�� ���ÿ� hap�� �������� �÷���
		}
		int i = 0;
		while(i<num.length) {
		// ����� ���� num�迭�� �ε����� 0���� 90���� �ݺ�����
			System.out.println("num["+i+"] : "+num[i]);
		i++;
		}
		System.out.println("�� : "+ hap);
	}

}

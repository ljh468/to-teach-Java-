// �迭�� ���հ� ���
// arr �迭�� 54, 74, 80, 92, 100 �� ������ �ְ� 
// �迭�� ���հ� ����� ���϶�
// ������ �����ϱ� ���� ������ sum
// ����� �����ϱ� ���� ������ average 

public class lecture02 {

	public static void main(String[] args) {
		
		int[] arr = {54, 74, 80, 92, 100};
		// �迭 arr�� ���� �ʱ�ȭ
		
		int sum = 0;
		float average = 0;
		// �ڹٴ� ������ ����Ҷ� ����� ���ÿ� ���� �ʱ�ȭ ���־���Ѵ�. ( ���� �ʱ�ȭ�����ʾƵ� ���Ǵ°�찡 ������ �ڹٿ����� ��Ģ�����δ� �ʿ��� , ����� ������� �� )
		
		for(int i = 0; i < arr.length; i++) { // i����  arr�� ���̸�ŭ �ݺ�����
					
			sum += arr[i];
			// sum = sum + arr[i]; �� ����
			// �ݺ����� ���ư������� sum���� �迭���� ���������� ������
		}
		System.out.println("���� : " + sum);
		average = sum / (float)arr.length ;
		// ���� �� �迭�� ������ ������ ����� ���Ҽ� ���� 
		System.out.println("��� : " + average);
		
	}

}

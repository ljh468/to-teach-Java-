// �迭  0, 10, 20, 30 ~ 100���� 10������ 11���� �迭�� �ʱ�ȭ�ϰ�
// �迭�� ����� ���� ������� ����϶�
public class lecture00 {

	public static void main(String[] args) {
		
		
		int[] arr = new int[11];
		
		for(int i = 0; i <= 10; i++) {
			arr[i] = i*10;
		}
		
		for(int k=0; k < arr.length; k++) {
		System.out.println(arr[k]);
		}
		
		
//		int[] arr = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//		// �迭�� �ʱ�ȭ
//		
//		for(int i = 0; i <= 10; i++) {
//			System.out.println(arr[i]);
//			//�ݺ����� �̿��� �迭 ���
//		}
	}

}

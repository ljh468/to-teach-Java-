// �迭�� �ִ밪�� �ּҰ�
// arr  �迭�� 64, 79, 56, 32, 88, 99���� �ʱ�ȭ �ϰ� �̹迭���� �ּҰ��� �ִ밪�� ���Ͽ� ����϶�
// �ּҰ��� min, �ִ밪�� max�� �Ѵ�
// ��Ʈ�� �ݺ������� ���ư��鼭 ���ǹ��� ����Ͽ� ���ϸ� ��

public class lecture03 {
	public static void main(String[] args) {
		int[] arr = { 64, 79, 56, 32, 88, 99 };
		
		int min = arr[0]; // �迭�� ù��°������ �ʱ�ȭ �Ѵ�.
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			// �迭�� �ι�°������ Ȯ���ϱ� ���� ���� i�� ���� 1�� �ʱ�ȭ
			
			if(arr[i] > max) { // �迭��  for������ ���������� ���鼭 ���Ҷ� max���� ũ��  ����max�� �־���
				max = arr[i];
			}else if(arr[i] < min) { // min���� ������ ���� min�� �־���
				min = arr[i];
			}
		}
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

	}
}

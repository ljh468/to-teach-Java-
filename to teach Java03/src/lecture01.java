// String ���ڿ� "�����ͺм���"�� �ϳ��� �ɰ��� ���ڿ��迭�� ����� ����϶�
// ��¿��� : "��" "��" "��" "��" "��" "��"
public class lecture01 {

	public static void main(String[] args) {
		String arr = "�����ͺм���";
		String[] str = arr.split("");
		// ���ڿ��� �ɰ������� split�Լ� ���
		
		for(int i = 0; i < str.length; i++) {
			System.out.print("\"" +str[i] + "\" ");
			// "ū����ǥ�� ���ڷ� �ֱ����ؼ��� \(�齽����)�� �ʿ���
		}
		
	}

}

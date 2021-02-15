// 로또 번호 만들기
// 보너스 문제 45개의 숫자를 임의로 지정해 6개의 숫자를 출력하라
// Math.random()함수는 0.0 부터 1.0 사이의 랜덤한 난수를 발생시키는 함수
public class lecture05 {

	public static void main(String[] args) {
		int[] num = new int[45];
		// 45개의 정수값을 저장하기위한 num배열 선언

		// 배열에 1~45의 값을 저장
		for (int i = 0; i < num.length; i++) { // 반복문을 이용하여 11부터 100까지 배열에 저장
			num[i] = i + 1; // num[0]에는 1이 저장
		}

		int tmp = 0; // 두값을 바꾸는데 사용할 임시변수
		int j = 0; // 임의의 값을 얻어서 저장할 변수
		for (int i = 0; i < 6; i++) {
			j = (int) ((Math.random() * 44)+1); // 0 ~ 44 범위의 임의의 값을 얻는다. ( num의 인덱스는 0~44까지이기때문 )
			// Math.random()함수는 0.0 <= X < 1.0 사이의 램덤한 난수를 발생시키는 함수
			tmp = num[i];
			num[i] = num[j];
			num[j] = tmp;
			// num[i] 와 num[j]값을 서로 바꾼다. ( tmp변수가 필요함 )

		}
		// 배열 num의 앞에서부터 6개를 출력
		for (int i = 0; i < 6; i++) {
			System.out.println("num[" + i + "] : " + num[i]);
		}

	}
}
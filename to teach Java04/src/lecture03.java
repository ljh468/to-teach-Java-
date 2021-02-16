// 배열의 최대값과 최소값
// arr  배열에 64, 79, 56, 32, 88, 99값을 초기화 하고 이배열에서 최소값과 최대값을 구하여 출력하라
// 최소값은 min, 최대값은 max로 한다
// 힌트는 반복문으로 돌아가면서 조건문을 사용하여 비교하면 됨

public class lecture03 {
	public static void main(String[] args) {
		int[] arr = { 64, 79, 56, 32, 88, 99 };
		
		int min = arr[0]; // 배열의 첫번째값으로 초기화 한다.
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			// 배열의 두번째값부터 확인하기 위해 변수 i의 값을 1로 초기화
			
			if(arr[i] > max) { // 배열이  for문에서 순차적으로 돌면서 비교할때 max보다 크면  변수max에 넣어줌
				max = arr[i];
			}else if(arr[i] < min) { // min보다 작으면 변수 min에 넣어줌
				min = arr[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}
}

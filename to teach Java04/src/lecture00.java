// 배열  0, 10, 20, 30 ~ 100까지 10단위로 11개의 배열을 초기화하고
// 배열에 저장된 값을 순서대로 출력하라
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
//		// 배열의 초기화
//		
//		for(int i = 0; i <= 10; i++) {
//			System.out.println(arr[i]);
//			//반복문을 이용해 배열 출력
//		}
	}

}

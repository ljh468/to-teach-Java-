// 배열의 총합과 평균
// arr 배열에 54, 74, 80, 92, 100 의 정수를 넣고 
// 배열의 총합과 평균을 구하라
// 총합을 저장하기 위한 변수는 sum
// 평균을 저장하기 위한 변수는 average 

public class lecture02 {

	public static void main(String[] args) {
		
		int[] arr = {54, 74, 80, 92, 100};
		// 배열 arr에 값을 초기화
		
		int sum = 0;
		float average = 0;
		// 자바는 변수를 사용할때 선언과 동시에 값을 초기화 해주어야한다. ( 값을 초기화하지않아도 사용되는경우가 있으나 자바에서는 원칙적으로는 필요함 , 어떤값이 저장될지 모름 )
		
		for(int i = 0; i < arr.length; i++) { // i값을  arr의 길이만큼 반복해줌
					
			sum += arr[i];
			// sum = sum + arr[i]; 와 같음
			// 반복문이 돌아갈때마다 sum에는 배열값이 순차적으로 더해짐
		}
		System.out.println("총합 : " + sum);
		average = sum / (float)arr.length ;
		// 총합 에 배열의 갯수를 나누면 평균을 구할수 있음 
		System.out.println("평균 : " + average);
		
	}

}

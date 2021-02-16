// 배열 num에 11부터 100까지 90개의 값을 순서대로 배열에 저장하고
// 배열을 순서대로 출력하고 배열의 총합을 출력하라.
// 총합을 저장하는 변수는 hap
// ex : num[0] : 11 
// 		num[1] : 12
//		...
//		num[89] : 100
//		총합 : 4995

public class lecture04 {

	public static void main(String[]args) {
		int[] num = new int[90];
		// 90개의 num배열 선언
		int hap = 0;
		// 총합을 저장하는 변수 hap을 초기화
		
		for(int i=0; i<num.length; i++) { // 반복문을 이용하여 11부터 100까지 배열에 저장
			num[i] = i + 11;
			hap += num[i];
			
			// 초기화와 동시에 hap에 누적으로 플러스
		}
		int i = 0;
		while(i<num.length) {
		// 출력을 위해 num배열의 인덱스를 0부터 90까지 반복해줌
			System.out.println("num["+i+"] : "+num[i]);
		i++;
		}
		System.out.println("합 : "+ hap);
	}

}

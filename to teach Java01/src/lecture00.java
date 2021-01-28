// 변수란 무엇인가?
// 변수 a에 6를 담고, 변수 b에2를 담아서
// 6+2, 6-2, 6*2, 6/2를  정수로 출력하시오

public class lecture00 {

	public static void main(String[] args) {
		
		// int는 정수  (4바이트)
		// float은 실수 (4바이트)
		// char는 문자 (2바이트)
		// string은 문자열 (입력한 글자수 * 2 바이트)
		// boolean는 true, false (1바이트)
		
		int a = 6;
		int b = 2;
		String str = "이재훈";
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}

}

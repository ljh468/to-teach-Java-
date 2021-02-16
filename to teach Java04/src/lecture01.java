// String 문자열 "데이터분석과"를 하나씩 쪼개서 문자열배열로 만들고 출력하라
// 출력예시 : "데" "이" "터" "분" "석" "과"
public class lecture01 {

	public static void main(String[] args) {
		String arr = "데이터분석과";
		String[] str = arr.split("");
		// 문자열을 쪼개기위한 split함수 사용
		
		for(int i = 0; i < str.length; i++) {
			System.out.print("\"" +str[i] + "\" ");
			// "큰따옴표를 문자로 넣기위해서는 \(백슬러쉬)가 필요함
		}
		
	}

}

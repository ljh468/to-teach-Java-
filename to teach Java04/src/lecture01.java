// List��ü
// Iterator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lecture01 {
	public static void main(String[] args) {
		List<String> rList = new ArrayList<String>();
		rList.add("��ü�������α׷���");
		rList.add("�ϵ�");
		rList.add("MongoDB");
		
		int i = 0;
		Iterator<String> it = rList.iterator();
		while(it.hasNext()) {
			String str = it.next();
//		    if(str.equals("��ü�������α׷���")){
			if(i==0) {
				System.out.println("<"+str+">");
			}else {
				System.out.println(str);
			}
			i++;
		}		
	}
}


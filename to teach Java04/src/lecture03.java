//  HashMap, ArrayList, Iterator Ȱ��

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class lecture02 {
	public static void main(String[] args) {
		List<HashMap<String,String>> rList = new ArrayList<>();
		HashMap<String, String> pMap = new HashMap<>();
		pMap.put("name", "������");
		pMap.put("Email", "h.lee@");
		pMap.put("addr", "����");
		
		rList.add(pMap);
		pMap = null;
		
		pMap = new HashMap<String,String>();
		pMap.put("name", "ȫ�浿");
		pMap.put("Email", "g.hong@");
		pMap.put("addr", "���");
		
		rList.add(pMap);
		pMap = null;
		
		Iterator<HashMap<String,String>> it = rList.iterator();
		while(it.hasNext()) {
			HashMap<String,String> rMap = it.next();
			
			System.out.println("name :" + rMap.get("name"));
			System.out.println("email :" + rMap.get("Email"));
			System.out.println("addr :" + rMap.get("addr"));
			rMap = null;
			System.out.println();
		}		
	}
}

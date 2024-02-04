package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map1 {
	
	public static void main(String args[]) {
		
		Map map = new HashMap();
		
		map.put(1001, "nikita");
		map.put(1002, "nisha");
		map.put(1003, "neha");
		
		System.out.println(map);
		
		  //for delete all elements
		//map.clear();
		
		System.out.println(map.containsKey(1001));
		
		System.out.println(map.containsValue("nikita"));
		
		System.out.println(map.get(1003));
		System.out.println(map.isEmpty());
		
		map.remove(1002);
		map.replace(1001, "ruchita");
		System.out.println(map);
		
		
		
	}
	
	

}

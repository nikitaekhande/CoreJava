package CollectionFramework;

import java.util.*;

public class Vector111 {
	
	public static void main(String args[]) {
		
		Vector v =new Vector();
		
		v.add("nikita");
		v.add('A');
		v.add(500);
		
		Iterator itr = v.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		System.out.println("Data:" +v);
}

}

package CollectionFramework;

import java .util.*;

public class Hashset1111 {
	
	public static void main(String arg[]) {
		
		HashSet set = new HashSet();
		
		set.add("nikita");
	     set .add("priti");  
	     set.add("nikii");                                         
	     
	     Iterator itr = set.iterator();
	     
	     while(itr.hasNext()) {
	    	 
	    	 System.out.println(itr.next());
	     }
	                                                             
	}

}

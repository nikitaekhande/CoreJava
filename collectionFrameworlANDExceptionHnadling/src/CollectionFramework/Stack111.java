package CollectionFramework;

import java .util.*;

public class Stack111 {
	
	public static void main(String args[]) {
		
		Stack s = new Stack();
		
		s.push("nikita");
		s.push("amruta");
		s.push("mitali");
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		System.out.println(s);
		
		System.out.println(s.search("amruta"));
		System.out.println(s.empty());
	//	System.out.println(s.pop());
	}
}

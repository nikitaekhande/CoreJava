package CollectionFramework;


import java.util.LinkedList;
import java .util.ArrayList;

public class LinkedList111 {
 
	public static void main(String args[]) {
		
		LinkedList ll = new LinkedList();
             ll.add("nik");
             
             ll.add('m');
             
             ll.add("mik");
             
             ll.add('n');
             ll.add("vira");
             
             ll.add('p');
             
             ll.addFirst("nikku");
            
             ll.addLast("omi");
             
             ll.remove(0);
            System.out.println( ll.getFirst());
            System.out.println( ll.getLast());
            
		
		
		
		System.out.println(ll);		
		
		
	}

	
}

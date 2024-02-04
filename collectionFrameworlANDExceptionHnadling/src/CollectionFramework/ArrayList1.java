package CollectionFramework;
 import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


 
public class ArrayList1 {
	
	public static void main(String args[]) {
		
		ArrayList al = new ArrayList();
		
		al.add(56);
		al.add("nikita");
		al.add('c');
		al.add(50);
		al.add("vira");
		al.add('A');
		al.add(70);
		al.add("mira");
		al.add('A');
		 
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		  
		
		System.out.println("DATA:" +al);
		
		 
		
		System.out.println("After Sorting: "+ al);  
		
		
		
		
	}
             
}

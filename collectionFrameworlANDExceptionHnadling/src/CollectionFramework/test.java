package CollectionFramework;

import java .util.ArrayList;
import java.util.HashSet;

import java .util.LinkedList;

public class test {
	
	public static void  main(String[]args) {
		
		ArrayList al = new ArrayList() ;
		
		al.add(10);
		al .add("nikita");
		al.add('A');
	
		
		HashSet hs = new HashSet();
		
		hs.add(20);
		hs.add("ankita");
		hs.add('B');
		
		LinkedList ll = new LinkedList();
		
		ll.add(30);
		ll.add("arohi");
		ll.add('C');
		
		System.out.println("Arraylist element:" + al);
		
		System.out.println("hashset element:" + hs);
		
		System.out.println("linkedlist element:" + ll);
	}

}

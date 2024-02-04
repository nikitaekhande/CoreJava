package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class collectionInterface {
	
	public static void main(String args[]) {
		
		ArrayList al = new ArrayList();
		
		al.add(200);
		al.add(300);
		al.add(500);
		
		ArrayList al2 = new ArrayList();
		
		al2.add("nikita");
		al2.add("arohi");
		al2.add("ankita");
		
		al.addAll(al2); 
		
		System.out.println(al);
		
		System.out.println(al.contains(800));
		System.out.println(al.contains(200));
		
		System.out.println(al2.size());
		System.out.println(al.remove("nikita"));
		
		System.out.println(al2.removeAll(al2));
		System.out.println(al2);
		
	}

}

package CollectionFramework;

import java .util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.awt.List;

public class InteratorAndListinterator
{
	
	
	public static void main(String args[])
	
	{
		
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add("nikita");
		l.add('v');
		
		System.out.println(l);
		
		Iterator itr = l.iterator();
		
		while (itr.hasNext()) 
		{
			
		System.out.println(itr.next());
			
			
	     }
			
	}
}

	



package genericList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class GenericList {
	
	

	public static void main(String args[]) {
		
		List <String> nameList = new ArrayList <String>();
		
		nameList.add("nikita");
		nameList.add("Arohi");
		nameList.add("pankaj");
		nameList.add("neha");
		
		System.out.println(nameList);
		
		Collections.sort(nameList);
		
		System.out.println(nameList);
		
		
		System.out.println("---------------------");
		
		Iterator<String> it = nameList.iterator();
		
		while(it.hasNext()) {
			
			String name = it.next();
			System.out.println( name.toUpperCase());
			
			
		}
		
		
			
			List<Integer> numList = new ArrayList<Integer>();
			numList.add(56);
			numList.add(90);
			numList.add(43);
			numList.add(16);
			numList.add(56);
			numList.add(87);
			
			
			System.out.println(numList);
			
			Iterator<Integer> num =numList.iterator();
			
			 while(num.hasNext()) 
			 {
				 
				 int numbers = num.next();
			 
				
				 System.out.println(numbers);
				 
				 }

			 
			 Collections.sort(numList);
			 
			 System.out.println(numList);
			 
			 
			 System.out.println("-------------------------------");
			 
			
			
				
		}	
	}
	
	



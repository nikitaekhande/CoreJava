package CollectionFramework;
import java .util.HashMap;

public class HashMap11 {
	
	public static void main(String args[]) {
		
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		   
		   //hashmap map deos not follow sorting and insertion order
		   
		   System.out.println(map);
	}

}

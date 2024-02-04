package CollectionFramework;

import java.util.TreeMap;

public class TreeMap111 {
           public static void main(String args[]) {
        	  
        	   
        	    //treemap follow sorting  order according to their key value
        	   
        	 TreeMap <Integer ,String>  tm = new TreeMap<Integer ,String> ();
        	 
        	 tm.put(106,"deepak");
        	 tm.put(103,"nikita");
        	 tm.put(107,"aarati");
        	 tm.put(102,"purva");
        	 tm.put(108,"nishita");
        	 
        	 System.out.println(tm);
        	   
        	   
        	   //Treemap has its own default sorting properties.
        	 System.out.println(  tm.size());
        	 
        	 //user defined sorting order
        	// tm.comparator();
        	 
        	 System.out.println(tm.containsKey(106));
        	 
        	// tm.get(103); get data according to key no
        	// tm.clear();
        	// tm.headMap(null)
           }
}

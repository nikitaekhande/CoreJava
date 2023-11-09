package com.tnsif.daythirteen;

import java.util.ArrayList;
import java.util.Date;
//import java.util.List;
import java.util.Collections;

public class ArrayListDemo {
	@SuppressWarnings("unchecked")
	
	public static void main(String args[]) {
		@SuppressWarnings("rawtypes")
		
		ArrayList rawlist = new ArrayList();
		rawlist.add(12);
		rawlist.add("hello");
		rawlist.add(12.78f);
		rawlist.add(true);
		rawlist.add("hello");
		rawlist.add(false);
		rawlist.add(12);
		rawlist.add("hello");
		rawlist.add("nashik");
		rawlist.add(new Date());
		System.out.println(rawlist);
		System.out.println( rawlist.contains("Hi"));
		
		System.out.println(rawlist.indexOf(12));
		System.out.println(rawlist.indexOf("Pune"));
		System.out.println(rawlist.remove(5)+" Removed....");
		System.out.println(rawlist);
		System.out.println(rawlist.remove("nashik")+" Removed....");
		System.out.println(rawlist);
		System.out.println(rawlist.remove("nashik")+" Removed....");
		System.out.println(rawlist);

		System.out.println(rawlist.remove(rawlist.indexOf(12))+" Removed....");
		System.out.println(rawlist);
		
		System.out.println(rawlist.remove("Hello")+" Removed....");
		System.out.println(rawlist);
		
		//exception raised - ClassCastException
		Collections.sort(rawlist);
		System.out.println(rawlist);
		
		//exception raised - IndexOutOfBoundsExcwption as 12 index is out of bounds for length 6
		System.out.println(rawlist.remove(12)+" Removed....");
		System.out.println(rawlist);
		
		
		
	}

}

package Comparator;


import java .util.List;
import java.util.Comparator;
import java .util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorDemo {
	
	public static void main(String args[]) {
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(1,"nikita",68));
		studentList.add(new Student(2,"neha",67));
		studentList.add(new Student(3,"abhi",69));
		studentList.add(new Student(5,"sangi",87));
		studentList.add(new Student(6,"om",64));
		
		System.out.println(studentList);
		
	   System.out.println("-----Sort by per------");
	   
	   Collections.sort(studentList, new SortByStudentPer());
	   
	   System.out.println(studentList);
	   
	   System.out.println("--------Sort by name-----");
	   
	   Collections.sort(studentList, new SortByStudentsName());
	   System.out.println(studentList);
	   
	}

}

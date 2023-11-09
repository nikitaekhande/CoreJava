package Comparator;

import java.util.Comparator;

public class SortByStudentPer implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getPer()-o2.getPer());
	}

}

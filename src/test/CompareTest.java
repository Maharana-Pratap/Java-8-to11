package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class NewStudent {
	Integer id;
	String name;
	
	public NewStudent(int id, String name) {
		this.id=id; this.name=name;
	}
	
	public String toString() {
		return String.format("Student: id = %s , name = %s", id,name);
	}
}

class StudentIdComparator implements Comparator<NewStudent> {

	@Override
	public int compare(NewStudent o1, NewStudent o2) {
		return Integer.compare(o1.id, o2.id);
	}	
}

class StudnetNameComparator implements Comparator<NewStudent> {

	@Override
	public int compare(NewStudent o1, NewStudent o2) {
		return o1.name.compareTo(o2.name);
	}
	
	
}

public class CompareTest {
 
	public static void main(String[] args) {
		List<NewStudent> studentList = new ArrayList<>();
		studentList.add(new NewStudent(4, "java"));
		studentList.add(new NewStudent(2, "php"));
		studentList.add(new NewStudent(5, "oracle"));
		
		System.err.println("sort by name");
		Collections.sort(studentList,new StudnetNameComparator());
		System.out.println(studentList);
		
		System.err.println("sort by id");
		Collections.sort(studentList,new StudentIdComparator());
		System.out.println(studentList);
				
		List<NewStudent> sLidt = studentList
				                 .stream()
				                 .sorted()
				                 .collect(Collectors.toList());
		System.err.println("Using Java-8 stream");
		System.out.println(sLidt);
	}
}

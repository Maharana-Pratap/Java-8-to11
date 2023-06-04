package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
	private String name;
	private int age;
	
	public Student() {}
	public Student(String name, int age) {
		this.age=age; this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class CollectorsToMap {
  
	public static void main(String[] args) {
				
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("rana",7));
		studentList.add(new Student("kittu",4));
		studentList.add(new Student("priya",7));
		
		Map<String,Integer> studentMap = studentList
				.stream().collect(Collectors.toMap(emp -> emp.getName() , emp -> emp.getAge()));
		System.out.println(studentMap);
	}
}

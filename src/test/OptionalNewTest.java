package test;

import java.util.Optional;

class Employee {
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString( ) {
		return String.format("Employe id %s, name %s ", id, name);
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName( ) {
		return name;
	}
	
}
public class OptionalNewTest {
   
	public static void main(String[] args) {
		
		Employee emp = new Employee(1, "java");
		
		// it will make empty Optional Object
		Optional<Employee> op1 = Optional.empty(); 
		op1 = Optional.of(emp); // pass value only static way only
		
		Employee e = op1.get();
		System.out.println(e.toString());		
		
		// will make Optional Object but does not throw nullPointer exception
		// when Optional.ofNullable() get value null. will return null value only.
		Employee emp2 = null;
		Optional<Employee> op2 = Optional.ofNullable(emp2);
		Employee e2 = op2.orElse(null);
		System.out.println("op2 name : "+e2);
		
		// will make Optional Object but throw nullPointer exception
		// when Optional.of() get value null
		Employee emp3 = null;
		Optional<Employee> op3 = Optional.of(emp3);
				
	}
}

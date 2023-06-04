package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class A {
	int id , age;
	String name;
	
	public A(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}	
		
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		return age == other.age && Objects.equals(name, other.name);
	}	
}

class B {
	int id, age;
	String name;
	
	public B(int id, int age, String name) {
		this.id=id;this.age=age;this.name=name;		
	}
	
	public int hashCode() {
		return Objects.hash(age,name);
	}
	
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj instanceof B)
			return true;
		 B other = (B) obj;
		 return ((this.age==other.age) && (this.name.equals(other.name)));
	}
}
public class EqualsOverride {

	public static void main(String[] args) {
		Map<A, Integer> aMap = new HashMap<>();
		aMap.put(new A(1,2,"java"), 1);
		aMap.put(new A(1,2,"java"), 2);
		
		Map<B,Integer> mapB = new HashMap<>();
		mapB.put(new B(1,2,".net"), 1);
		mapB.put(new B(1,5,".net"), 2);
		
		System.out.println(mapB.size());
	}
}

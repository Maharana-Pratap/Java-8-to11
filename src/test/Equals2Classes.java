package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Cup {
	int id;
	String name;
	Pyali pyali;	
	
	public Cup(int id, String name, Pyali pyali) {
		this.id=id; this.name=name; this.pyali=pyali;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name,pyali);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(null == obj)
			return false;
		if(obj instanceof Cup) 
			return true;
		
		Cup c = (Cup) obj;
		return c.id==id && Objects.equals(c.name, name) && c.pyali==pyali;
	}
	
	@Override
	public String toString() {
		return String.format("Cup name : %s, name : %s, \n Pyali: %s", id,name,pyali.toString());
	}
	
}

class Pyali {
	int id; 
	String name;
	
	public Pyali(int id, String name) {
		this.id=id; this.name=name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name);		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(null == obj)
			return false;
		if(obj instanceof Pyali)
			return false;
		Pyali p = (Pyali) obj;
		return p.id==this.id && Objects.equals(p.name, this.name);
	}
	
	@Override
	public String toString() {
		return String.format("Pyali id : %s, name : %s ", id,name);
	}
}

public class Equals2Classes {

	public static void main(String[] args) {
		Cup cup = new Cup(1,"putti",new Pyali(1,"java"));
		Cup cu2 = new Cup(1,"putti",new Pyali(1,"java"));
		Cup cu3 = new Cup(1,"putti",new Pyali(1,"oracle"));
		
		System.out.println(cup);
		
		Map<Cup,Integer> map = new HashMap<>();
		map.put(cu2, 1);
		map.put(cup, 2);
		map.put(cu3, 3);
		System.out.println("Map Size : "+map.size());	
		
	}
}

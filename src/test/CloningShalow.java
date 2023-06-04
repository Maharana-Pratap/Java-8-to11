package test;

// example of salow cloning

class CloneA implements Cloneable {
	int id; 
	String name;
	CloneB coCloneB;
	
	public void setCoCloneB(CloneB coCloneB) {
		this.coCloneB = coCloneB;
	}

	public CloneA(int id, String name, CloneB cb) {
		this.id=id; this.name=name; this.coCloneB=cb;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();		
	}
	
	@Override
	public String toString() {
		return String.format("id : %s , name : %s , Address : %s", id,name,this.coCloneB.toString());
	}
}

class CloneB {
	String address;
	
	public CloneB(String ad) {
		this.address=ad;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	@Override
	public String toString() {
		return String.format("Address : %s", address);
	}
}

public class CloningShalow {

	public static void main(String[] args) throws CloneNotSupportedException {

		CloneA obj1 = new CloneA(1, "mobile",new CloneB("New Delhi"));
		CloneA obj2 = (CloneA) obj1.clone();
		obj2.setName("asdf");
		//below address will change to both of obj
		obj2.coCloneB.address="Bihar";  
		//obj2.setCoCloneB(new CloneB("Bihar"));
		
		System.out.println("obj1 : "+obj1.toString());
		System.out.println("obj2 : "+obj2.toString());
	}

}

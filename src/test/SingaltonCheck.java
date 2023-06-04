package test;

class Check {
	
	private static Check obj = null;	
	private Check() {}
	
	public synchronized static Check getObject() {
		if(null == obj) {
			obj = new Check();
		}		
		return obj;
	}
	
	static void show() {
		System.out.println("showing singalton!");
	}
}

public class SingaltonCheck {
	
	public static void main(String args) {
		System.out.println(args);
	}
	public static void main(String[] args) {
		Check c1 = Check.getObject();
		Check c2 = Check.getObject();
		System.out.println(c1==c2);
		main("Main method overloaded!!!");
	}
}

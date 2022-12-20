package test;

@FunctionalInterface
interface User {
	String showName(String name);
	public static void addMsg(String msg) {
		System.out.println(msg);
	}
}

@FunctionalInterface
interface Test {
	int add(int a, int b);
	default void show() {
		System.out.println("from interface show");
	}
	
	default void watch() {
		System.out.println("from interface watch");
	}
}
public class LemdaTest {

	public static void main(String[] args) {
		System.out.println("just show");
		
		Test t = (int a,int b) -> {
			return (a+b);		
		};
		System.out.println(t.add(5, 8));
		t.show(); t.watch();
		
		User u = name -> {
			return "Hello : "+name;
		};
		System.out.println(u.showName("Pratap"));
		User.addMsg("from static message");
	}
}

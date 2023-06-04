package java9;


interface Java9 {
	private void test() {
		System.out.println("Java9-Private");
	}
	
	default void mthod1() {
		System.out.println("Java9-default");
		test();
	}
}

public class Java9InterfaceTest implements Java9 {
	public static void main(String[] args) {
		Java9InterfaceTest java = new Java9InterfaceTest();
		java.mthod1();
	}
}

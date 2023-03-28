package test;

class Parent {
	protected int a=10;
	public int b=5;
	
	protected Parent(int a, int b) {
		this.a=a;
		this.b=b;
	}
	protected int addVal() {
		return a+b;
	}
	
	protected static void test() {
		System.out.println("from parent");
	}
}

class Chield extends Parent {
	protected Chield(int a, int b) {
		super(a,b);
	}
	protected static void test() {
		System.out.println("from Chield");
	}
}
public class StaticOveride {

	public static void main(String[] args) {
		//Parent p = new Chield();
		//p.test();
		
		Chield c = new Chield(9,9);
		System.out.println(c.addVal());
		
	}
}

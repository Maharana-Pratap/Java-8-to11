package test;

public class FinalyTest {	
	@SuppressWarnings("finally")
	int test(int val) {
		try {
			System.out.println("From Try Block");
			return val;
		} catch(Exception ex) {
			System.out.println("From Ex Block");
			return 5;
		} finally {
			System.out.println("From Finally Block");
			return 6;
		}
	}
	public static void main(String[] args) {
		FinalyTest t = new FinalyTest();
		System.out.println(t.test(8));
	}
}

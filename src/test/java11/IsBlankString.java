package test.java11;

public class IsBlankString {
	public static void main(String[] args) {
		System.out.println(" ".isBlank());  // true
		System.out.println("".isBlank());  // true
		
		System.out.println(" ".isEmpty()); // false
		System.out.println("".isEmpty()); // true
	}
}

package test;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "java";  // will make object only 1 in string pool area
		String s2 = new String("java");  // new String() will make 2 objects 
		String s3 = new String(s1);
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
				
		String s = String.format("String value pring : %s , %s", s1, s2);
		System.out.println(s);
	}
}

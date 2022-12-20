package test;

public class SeqPrint {

	public static void main(String[] args) {
		String no = "4321";
		
		char[] arr = no.toCharArray();		
		for(int i = 0; i<arr.length; i++) {			
			System.out.println(no.substring(0, arr.length-i));			
		}
		System.err.println("2nd");
		for(int a = 0; a<arr.length; a++) {				
			System.out.println(no.substring(a, arr.length));
		}		
	}
}

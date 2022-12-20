package test;

public class NumberFromString {

	public static void main(String[] args) {

		String st = "abc123xyz";
		
		char[] arr = st.toCharArray();
		
		for(char c : arr) {
			if(Character.isDigit(c)) {
				System.out.println(c);
			}
		}
	}

}

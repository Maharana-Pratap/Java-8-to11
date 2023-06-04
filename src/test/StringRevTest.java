package test;

public class StringRevTest {

	public static void main(String[] args) {
		String str = "abcba";
		
		char[] arr = str.toCharArray();		
		StringBuffer buff = new StringBuffer();
		
		//=== Testing for print reverse string	
		String revStr = "";  	
		for(int i = arr.length-1; i >= 0; i--) {
			revStr = revStr + arr[i];
		}
		
		System.out.println("revStr : "+revStr);
		
		for(char c : arr) {
			buff.append(c);
		}
		
		System.out.println(buff);
		
		if(str.equalsIgnoreCase(buff.reverse().toString())) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
	}

}

package test;

public class AllNoAdd {

	public static void main(String[] args) {
		int no = 12345;
		String st = "";		
		int add = 0;			
		
			while(no > 0) {
				st = st + (no % 10);			
				no = no / 10;				
			}
			char[] arr = st.toCharArray();
			for(char c : arr) {
				add = add + Integer.parseInt(String.valueOf(c));
			}
			System.out.println(add);
	}

}

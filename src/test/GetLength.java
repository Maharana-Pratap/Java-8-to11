package test;

public class GetLength {

	// find smallest length of string
	public static void main(String[] args) {
		String[] arr = {"java","oracle","p","php","msnet","nt","oh"};
		
		int index = 0;
		for(int i=0; i<arr.length; i++) {			
			if(i > 0) {
				if(arr[i].length() < arr[index].length()) {
					index = i;
				} 
			}
		}
		
		System.out.println(arr[index]);
	}

}

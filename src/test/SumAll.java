package test;

import java.util.List;

public class SumAll {	 
	public static void main(String[] args) {
		List<Integer> list = List.of(10,20,30,40,50);
		Integer all = list.stream().mapToInt(i -> i).sum();
		System.out.println(all);
		
		int no = 12345;
		String str = "";
		int addNo = 0;
		
		while(no >  0) {
			str = str + (no % 10);			
			no = (no / 10);
		}
		
		char[] arr = str.toCharArray();
		for(char n : arr) {
			addNo = addNo + Integer.parseInt(String.valueOf(n));
		}
		System.out.println("addNo : "+addNo);
	}

}

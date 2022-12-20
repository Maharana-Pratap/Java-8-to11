package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShowUnique {
	
	public static void main(String... args) {
		String name = "maharanapratap";
		List<String> st = new ArrayList<>();
		char[] arr = name.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			st.add(Character.toString(arr[i]));
		}
		
		st.forEach(data -> {
			if(Collections.frequency(st, data) == 1) {
				System.out.println(data);
			}
		});
		
		
		
	}

}

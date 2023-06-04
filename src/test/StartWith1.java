package test;

import java.util.List;

public class StartWith1 {
	
	public static void main(String[] args) {		
		List<Integer> st1 = List.of(1,22,11,55,18);		
		st1.stream()
		.map(val -> val+"")
		.filter(val -> val.startsWith("1"))
		.forEach(System.out::println);
	}

}

package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {

	public static void main(String[] args) {

		List<String> l1 = Arrays.asList("aa","bb");
		List<String> l2 = Arrays.asList("cc","dd");
		List<String> l3 = Arrays.asList("ee","ff");
		
		List<List<String>> all = Arrays.asList(l1,l2,l3);
		System.out.println("Before flatMap() : "+all);
		
		List<String> flatList = all.stream()
				.flatMap(list -> list.stream())
				.collect(Collectors.toList());
		
		System.out.println("After apply flatMap() "+flatList);
	}

}

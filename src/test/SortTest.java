package test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTest {

	public static void main(String[] args) {

		List<String> sList = List.of("t","e","a","r","b","x");
		
		// Reverse order
		List<String> reverseOreer = sList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());	
		
		// sorted order
		List<String> sortedList = sList.stream().sorted().collect(Collectors.toList());		
		
		System.out.println("sortedList : "+sortedList);
		System.out.println("reverseOreer : "+reverseOreer);
	}

}

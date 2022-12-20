package test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortTest {

	public static void main(String[] args) {

		List<String> sList = List.of("t","e","a","r","b","x");
		
		// Reverse order
		//List<String> rord = sList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());		
		List<String> rord = sList.stream().sorted().collect(Collectors.toList());		
		Collections.sort(rord);
		System.out.println(rord);
	}

}

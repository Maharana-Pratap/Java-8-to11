package test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumSortStream {

	public static void main(String[] args) {
		List<Integer> numList = List.of(4,2,6,8,1,2);
		
		List<Integer> sortNum = numList.stream().sorted().collect(Collectors.toList());
		System.out.println("Assending Order : "+sortNum);
		
		List<Integer> reverse = numList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reverse Order : "+reverse);
	}
}

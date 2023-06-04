package test;

import java.util.Comparator;
import java.util.List;

public class Find2ndLargest {

	public static void main(String[] args) {
		List<Integer> noList = List.of(8,4,3,2,9,5);
		
		// finding 2nd largest no of list
		Integer large2nd = noList.stream()
				                 .sorted(Comparator.reverseOrder())
				                 .skip(1)
				                 .findFirst()
				                 .get();
		System.out.println("2nd max No : "+large2nd);
		
		
		// finding 2nd largest no of list
		Integer min2nd = noList.stream()
						       .sorted()
						       .skip(1)
						       .findFirst()
						       .get();
	    System.out.println("2nd min No : "+min2nd);
				          
	}
}

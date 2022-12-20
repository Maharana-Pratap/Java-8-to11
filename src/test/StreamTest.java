package test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTest {

	public static void main(String []args) {
		List<Integer> arr = List.of(2,4,1,5,3,10,9);
		
		Integer val = arr.stream().max(Integer::compare).get();		
		System.out.println(val);
		
		Optional<Integer> val2nd = arr.stream()
				.sorted(Comparator.reverseOrder())
				.limit(2).skip(1).findFirst();
		
		System.out.println(val2nd.get());
	}
}

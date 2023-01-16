package test;

import java.util.List;
import java.util.stream.Collectors;

public class LimitStream {

	public static void main(String[] args) {

		List<Integer> nos = List.of(1,2,3,4,5,6,7,8,9);
		
		// skip first 2 values
		List<Integer> skip = nos.stream().skip(2).collect(Collectors.toList());
		System.out.println(skip);
		
		// limit to get first 4 values
		List<Integer> limit = nos.stream().limit(4).collect(Collectors.toList());
		System.out.println(limit);
		
		// Use skip() - limit() together
		List<Integer> sklimit = nos.stream().skip(3).limit(5).collect(Collectors.toList());
		System.out.println("sklimit "+sklimit);
	}

}

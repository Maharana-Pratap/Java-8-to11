package test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) {
		List<String> list = List.of("java",".net","php","java");
		
		Map<String,Long> result = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(result);
	}
}

package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.OptionalInt;

public class FindMaxVal {

	public static void main(String[] args) {
		Map<Integer,String> empList = new HashMap<>();
		empList.put(2, "php");
		empList.put(1, "java");		
		empList.put(3, "oracle");
		
		List<Map<Integer, String>> keyList = new ArrayList<>();
		keyList.add(empList);
		
		System.err.println("original input order print");
		System.out.println(keyList);
		
		List<Integer> keys = new ArrayList<>();
		for(Entry<Integer,String> entry : empList.entrySet()) {
			keys.add(entry.getKey());
		}
		Collections.reverse(keys);
		System.err.println("revers order print");
		keys.forEach(key -> {
			System.out.println("key : "+key +" value: "+empList.get(key));
		});
		
		// to print max value using stream api
		System.err.println("max value print");
		OptionalInt max = keys.stream().mapToInt(v -> v).max();		
		System.out.println(empList.get(max.orElseThrow(NoSuchElementException::new)));
		
		// to print min value using stream api
		System.err.println("min value print");
		Integer min = keys.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new);
		System.out.println(empList.get(min));
		
	}

}

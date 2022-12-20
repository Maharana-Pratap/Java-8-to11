package test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterAndMap {	
	public static void main(String[] args) {
	Stream<String> st =	Stream.of("abc" , "xyz" , "abc");		
		List<String> findVal = st.filter(data -> data.equals("xyz")).map(dat -> dat).collect(Collectors.toList());
		System.out.println(findVal);		
	}
}

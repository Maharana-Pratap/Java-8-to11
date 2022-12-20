package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class MinMaxFromList {

	public static void main(String[] args) {

		// Get max value from list using stream
		List<Integer> numList = List.of(4,2,6,8,1,2);
		Integer maxVal = numList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("maxVal : "+maxVal);
		
		// Get max value from list using stream.mapToInt
		// this method only apply for [ Integer,Long,Double ] values only
		Integer maxValue = numList.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
		System.out.println("maxValue : "+maxValue);
		
		// Get min value from list using stream
		Integer minVal = numList.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("minVal : "+minVal);
		
		String str = "maharanapratap";
		char[] charArr = str.toCharArray();
		List<Character> charList = new ArrayList<>();
		for(char c : charArr) {
			charList.add(c);
		}
		
		// Get max value from char-list using stream
		char maxChar = charList.stream().max(Comparator.comparing(Character::valueOf)).get();
		System.out.println("maxChar : "+maxChar);
		
		// Get max value from char-list using stream
		char minChar = charList.stream().min(Comparator.comparing(Character::valueOf)).get();
		System.out.println("minChar : "+minChar);
	}

}

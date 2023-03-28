package test.java11;

import java.util.List;
import java.util.stream.Collectors;

public class SplitLines {

	public static void main(String[] args) {
		String linesString = "Maharana\nPratap\nSingh";
		System.out.println(linesString);
		
		// java-11 added string.lines() to convert string to list from new line separator
		List<String> lines = linesString.lines().collect(Collectors.toList());
		System.out.println(lines);
	}
}

package test.java11;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LemdaLocalVar {

	//Support for using the local variable syntax (var keyword) in lambda parameters was added in Java 11.
    //We can make use of this feature to apply modifiers to our local variables, like defining a type annotation:
	public static void main(String[] args) {

		List<String> sampleList = List.of("Java","", "Kotlin");
		String resultString = sampleList.stream()
				.filter(Predicate.not(String::isBlank))
				.map((var data) -> data.toUpperCase())				
				.collect(Collectors.joining(" , "));
		System.out.println(resultString);
	}

}

package test;

import java.util.List;
import java.util.regex.Pattern;

public class VarInLambdaExample {

	public static void main(String[] args) {
		
		// java-11 var update in lemda
		List.of(1,3,2,4,7,5,6)
		.stream()
		.filter((var i) -> i % 2 ==0)  // using var keyword here from java 11
		.forEach(System.out::println);
		
		
		var str = Pattern.compile("aba").asMatchPredicate();
		System.out.println(str.test("aabb"));
		System.out.println(str.test("aba"));
	}
}

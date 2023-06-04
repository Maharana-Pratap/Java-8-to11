package test;

import java.util.Optional;

public class OptionalFilterEx {

	public static void main(String[] args) {
		
		// filter for number
		Optional<Integer> op1 = Optional.of(125);
		Integer v1 = op1.filter(num -> num > 99)
				.orElse(0);
		System.out.println(v1);
		
		// filter for string
		Optional<String> op2 = Optional.of("Java_String");
		String v2 = op2.filter(str -> str.contains("_"))
				       .orElse("Invalie String format");
		System.out.println(v2);
	}
}

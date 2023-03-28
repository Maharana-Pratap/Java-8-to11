package test;

import java.util.Optional;

public class OptionalTest {

	static Optional<String> changeCase(String name) {
		if(name != null) {
			return Optional.of(name.toUpperCase());
		} else {
			return Optional.ofNullable(name);
		}
	}
	public static void main(String... args) {
		
		Optional<String> nm = OptionalTest.changeCase(null);
		if(nm.isPresent())
		System.out.println(nm.get());
		
		// calling with null value
		Optional<String> name = OptionalTest.changeCase(null);
		String s = name.orElse("No name parameter found");		
		System.out.println(s);
		
		// calling with Valid value
		Optional<String> name2 = OptionalTest.changeCase("java");
		String s2 = name2.orElse("No name parameter found");		
		System.out.println(s2);
	}
}

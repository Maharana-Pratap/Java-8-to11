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
		
		Optional<String> name = OptionalTest.changeCase("java");
		String s = name.orElse("No name parameter found");		
		System.out.println(s);
	}
}

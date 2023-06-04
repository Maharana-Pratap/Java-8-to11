package test;

import java.util.List;
import java.util.function.Function;


// Function.identity() will return as same as get input
public class FunctionIdentity {

	public static void main(String[] args) {
		List<String> stringList = List.of("abc","def","ghi");
		
		      // using Function.identity()
		                        stringList
								.stream()
								.map(Function.identity())
								.forEach(System.out::println);										
		                        
		    // using Function.identity() internaly                        
		                        stringList
		                        .stream()
		                        .map(data -> data)
		                        .forEach(System.out::println);
		
	}
}

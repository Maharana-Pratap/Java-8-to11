package test;

import java.util.Arrays;

// java-8 reduce method will apply
public class ReduceTest {

	public static void main(String[] args) {
		
		// Before java 8
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		  int sumNum = 0;
		  for (int i : num) {
			  sumNum += i;
		  }

		  System.out.println("sum : " + sumNum); // 55
		  
		 // Add(+) all numbers Using stream.reduce() 
		 int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// 1st argument, init value = 0
		  int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
		  System.out.println("sum by reduce() : " + sum); // 55
		  
		  
		  // using reduce() concatenate all array string here
		  String[] stringArr = {"a","b","c","d"};
			String reduceString = Arrays.stream(stringArr)
					                    .reduce("", (a,b) -> a+b);
			System.out.println("reduceString : "+reduceString);
	}
}

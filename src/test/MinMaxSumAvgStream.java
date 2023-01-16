package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSumAvgStream {

	public static void main(String[] args) {

		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		//By using lambda
	    int sum = primes.stream().mapToInt(a->a).sum();
	    System.out.println(sum);
	    int min = primes.stream().mapToInt(a->a).min().orElse(0);
	    System.out.println(min);
	    int max = primes.stream().mapToInt(a->a).max().orElse(0);
	    System.out.println(max);
	    double average = primes.stream().mapToInt(a->a).average().orElse(0);
	    System.out.println(average);
	    
	    //By using Collections
	    System.out.println(Collections.min(primes));
	    System.out.println(Collections.max(primes));
	}

}

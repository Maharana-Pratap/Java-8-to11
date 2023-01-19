package test;

import java.util.List;

public class SeqVsParallelStreamTest {

	public static void main(String[] args) {
		
		List<String> list = List.of("Java ","d","e","v","loper");
		
		// Always use single thread so return value as user Entered
		System.err.println("Seq Stream");
		list.stream().forEach(System.out::println);
		
		// (1). Always Divide list in to multiple parts first
		// (2). Then use multiple threads to process
		// (3). return value as per thread finish the task.
		// (4). The final result is the combination of each individual outcome.
		// So, It return always diffrent 
		System.err.println("Parallel-1 Stream");
		list.stream().parallel().forEach(System.out::println);
		
		// (1). Always Divide list in to multiple parts first
		// (2). Then use multiple threads to process
		// (3). return value as per thread finish the task.
		// (4). The final result is the combination of each individual outcome.
		// So, It return always diffrent 
		System.err.println("Parallel-2 Stream");
		list.parallelStream().forEach(System.out::println);
	}
}

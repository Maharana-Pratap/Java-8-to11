package test;

import java.util.Arrays;
import java.util.List;

public class StreamMinMax {

	public static void main(String[] args) {

		List<Integer> noList = Arrays.asList(2,4,1,6,3,9);
		
		// finding max()
		int maxNo = noList.stream()
		      .mapToInt(val -> val)
		      .max()
		      .getAsInt();
		
		System.out.println("max value : "+maxNo);
		
		// finding min()
		int minNo = noList
				    .stream()
				    .mapToInt(no -> no)
				    .min()
				    .getAsInt();
		
		System.out.println("min value : "+minNo);
	}

}

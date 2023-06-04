package test;

import java.util.Arrays;

public class SecondLarge {
	//Finding 2nd largest no from array
	public static void main(String[] args) {
		int[] arr = {9,3,4,1,6,7};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}
}

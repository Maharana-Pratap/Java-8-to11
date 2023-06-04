package test;

import java.util.Random;

// Using Random class
public class RandomTest {

	public static void main(String[] args) {
		Random random = new Random();
		
		// It will generate random one integer number
		System.out.println("AutoGenetaed No : "+random.nextInt());
		
		// it will generate random value less that 9
		for(int i=0; i<=10; i++) {
			Integer no = random.nextInt(9); 
			System.out.println(i+" : "+no);				
		}		
		
	}
}

package test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Example {
    
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String name = "Maharana";
		
		//Create MessageDigest object for MD5
		MessageDigest md = MessageDigest.getInstance("MD5");		
		//byte[] result = md.digest(name.getBytes());
		
		//Update input string in message digest
		md.update(name.getBytes(),0,name.length());
		
		//Converts message digest value in base 16 (hex) 
		String output = new BigInteger(1, md.digest()).toString(16);
		System.out.println(String.format(output));
	}
}

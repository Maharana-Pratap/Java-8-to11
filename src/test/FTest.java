package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Find the frequency of all chars from string
public class FTest {

	public static void main(String[] args) {
 
		String string ="India Is  My Country";
		String noSpace = string.replaceAll("\\s", "");  // here s is pointing single space.
		//String noSpace = string.replaceAll(" ", "");
		char[] arr = noSpace.toCharArray();
				
		List<String> strList = new ArrayList<>();
		
		for(int i=0; i<arr.length;i++) {
			strList.add(String.valueOf(arr[i]));
		}
		
		for(String data : strList) {			
			Integer times =  Collections.frequency(strList, data);
			System.out.println(data+" is = "+times);
		}
	}

}

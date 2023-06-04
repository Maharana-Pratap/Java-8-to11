package test.java11;

import java.util.Arrays;
import java.util.List;

//The java.util.Collection interface contains a new default toArray method which takes an IntFunction argument.
//This makes it easier to create an array of the right type from a collection:
public class DefaultToArray {

	public static void main(String[] args) {
	  List<String> list = Arrays.asList("java","","php","    ","oracle");
	  String[] atrList = list.toArray(String[]::new); // new freature added in java-11
	  for(int i=0; i<atrList.length; i++) {
		  if(!atrList[i].isBlank()) // filter blank String value
		  System.out.println(atrList[i]);
	  }
	}
}

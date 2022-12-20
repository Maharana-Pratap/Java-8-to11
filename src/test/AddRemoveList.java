package test;

import java.util.ArrayList;
import java.util.List;

public class AddRemoveList {
	public static void main(String[] args) {
		List<String> lt = new ArrayList<>();
		lt.add("abc");
		lt.add("xyz");
		lt.add("rama");

		for(String str : lt) {
			if(str.equalsIgnoreCase("xyz")) {
				lt.remove(str);
			}
		}
		
		System.out.println(lt);
	}

}

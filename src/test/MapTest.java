package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		map.put(1, "java");
		map.put(2, "Spring");
		map.put(3, "Jpa");
		
		
		for(Map.Entry<Integer, String> mp : map.entrySet()) {
			System.out.println(mp.getKey() + " : "+mp.getValue());
		}
		
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		set.forEach(data -> {
			System.out.println(data.getKey() + " : "+data.getValue());
		});
		
		System.out.println("======== using java-8 forEach ============");
		// ======== using java-8 forEach ============
		map.forEach((key,value) -> {
			System.out.println("key: "+key+", value : "+value);
		});
		
	}

}

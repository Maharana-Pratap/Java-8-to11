package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Bottle {	
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}

public class FilterAndMap {	
	public static void main(String[] args) {
	Stream<String> st =	Stream.of("abc" , "xyz" , "abc");		
		List<String> findVal = st.filter(data -> data.equals("xyz")).map(dat -> dat).collect(Collectors.toList());
		System.out.println(findVal);
		
		// print those names which start with "ra"
		List<String> nameList = List.of("rana", "kittu","raman");
		List<String> names = nameList.stream()
				                     .filter(name -> name.startsWith("ra"))
				                     .map(name -> name.toUpperCase())
				                     .collect(Collectors.toList());
		
		System.out.println("NameList : "+names);
		
		// use only filter
		List<Integer> noList = List.of(4,2,7,5,8,4,6,9,2);
		List<Integer> nos = noList
							.stream()
							.filter(no -> no > 4)
							.collect(Collectors.toList());
		nos.forEach(System.out::println);
		
		// mutiplse map
		Bottle b1 = new Bottle();
		b1.setId(1);
		b1.setName("abc");
		
		Bottle b2 = new Bottle();
		b2.setId(2);
		b2.setName("zyz");
		
		List<Bottle> bottleList = new ArrayList<>();
		bottleList.add(b2); 
		bottleList.add(b1);
		
		List<Object> list = bottleList
								  .stream()
								  .map(data -> data.getId())
								  //.map(data -> data.getName())
								  .collect(Collectors.toList());
	}
}

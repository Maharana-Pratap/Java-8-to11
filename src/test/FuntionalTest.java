package test;

@FunctionalInterface
interface TestF {
	void first();
}

@FunctionalInterface
interface TestName {
	String name(String name);
}

@FunctionalInterface
interface TestAdd {
	int add(int a, int b);
	static String getName(String name) {
		return name;
	}
	
	default int age(int ae) {
		return ae;
	}
}

public class FuntionalTest {
	public static void main(String[] args) {
//		TestF f = () -> {
//			System.out.println("l test");
//		};
//		
//		f.first();
//	}
	
//	TestName nameg = (String tname) -> {
//		return "name : "+tname;
//	};
//	System.out.println(nameg.name("kittu"));	

	TestAdd add = (int a, int b) -> {
		return a+b;
	};
      System.out.println(add.add(4, 9));
      System.out.println(TestAdd.getName("Maharana"));
      System.out.println(add.age(41));
	}
}

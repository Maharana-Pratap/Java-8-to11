package test;

import java.util.List;

class Table implements Comparable<Table> {

	int id;
	String name;

	public Table(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Table o) {
		// sorting by id
		return Integer.compare(id, o.id);
		// sorting by name
		// return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return String.format("Table Id : %s, name : %s", id, name);
	}
}

public class ComparableTest {

	public static void main(String[] args) {
		List<Table> tableList = List.of(new Table(1, "java"), new Table(2, "dotnet"));
		tableList.stream().sorted().forEach(System.out::println);
	}
}

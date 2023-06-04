package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class EmpDepartment {
	private String empName;
	private String department;
	private Integer empAge;
	
	public EmpDepartment() {}
	
	public EmpDepartment(String empName, String department, Integer empAge) {
		super();
		this.empName = empName;
		this.department = department;
		this.empAge = empAge;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getEmpAge() {
		return empAge;
	}
	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "EmpDepartment [empName=" + empName + ", department=" + department + ", empAge=" + empAge + "]";
	}
	
	
	
}

public class GroupBy {

	public static void main(String[] args) {
		List<String> list = List.of("java",".net","php","java");
		
		// Find frequecny of input value
		Map<String,Long> result = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));		
		System.out.println(result);
		
		// finding record group_by department
		List<EmpDepartment> empList = new ArrayList<>();
		empList.add(new EmpDepartment("raja","it",6));
		empList.add(new EmpDepartment("rahul","it",9));
		empList.add(new EmpDepartment("pinky","home",11));
		empList.add(new EmpDepartment("salu","home",12));
		
		Map<String,List<EmpDepartment>> empGroupingByDep = new HashMap<>();
		
		 empGroupingByDep = empList.stream()
				           .collect(Collectors.groupingBy(EmpDepartment::getDepartment));				        		    
				        				  // Collectors.mapping(EmpDepartment::getDepartment,
				        					//	   Collectors.toList()));
		 
	    				  
                                        
		
		System.out.println(empGroupingByDep);
	}
}

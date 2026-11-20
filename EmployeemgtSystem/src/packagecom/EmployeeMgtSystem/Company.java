package packagecom.EmployeeMgtSystem;

public class Company {
public static void main(String[] args) {
	System.out.println("===MAIN METHOD===");
	Department dep = new Department();
	
	
	Employee emp = dep.addEmployee();
	//System.out.println(emp.eid+" "+emp.name+" "+emp.salary);
	System.out.println(emp);
	
	System.out.println("===ALL EMPLOYEE INFO");
	
	AllEmployee all1= dep.addAllEmployee();
	System.out.println(all1);
	
}
}

package packagecom.EmployeeMgtSystem;

public class Department {
	
	public Employee addEmployee() 
	{
		Employee emp = new Employee();
		emp.eid = 39;
		emp.name = "Kartik";
		emp.salary = 20500.58;
		
		Employee emp1 = new Employee();
		emp1.eid = 29;
		emp1.name = "Amay";
		emp1.salary = 21300.92;
		
		return emp1;
	}
public AllEmployee addAllEmployee()
{
AllEmployee all = new AllEmployee();
all.Prathmesh.eid = 98;
all.Prathmesh.name = "PRATHMESH";
all.Prathmesh.salary = 37890.89;

all.Santosh.eid = 88;
all.Santosh.name = "SANTOSH";
all.Santosh.salary = 25408.89;

all.Atharv.eid = 78;
all.Atharv.name = "ATHARV";
all.Atharv.salary = 32178.89;

all.Srinivas.eid = 48;
all.Srinivas.name = "SRINIVAS";
all.Srinivas.salary = 356178.89;

return all;	
}
}

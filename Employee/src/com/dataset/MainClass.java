package com.dataset;

public class MainClass {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.eid = 20;
		employee.name = "Prathmesh";
		employee.salary = 19000.78;
		employee.contact = 9405405030l;
		employee.grade = 'A';
		
		Employee employee2 = new Employee();
		employee2.eid = 29;
		employee2.name = "Prakash";
		employee2.salary = 45789.98;
		employee2.contact = 9970787957l;
		employee2.grade = 'B';
		
		System.out.println(employee.eid+" "+ employee.name+" "+ employee.salary +" "+ employee.contact+" "+ employee.grade);
		System.out.println(employee2.eid+" "+ employee2.name+" "+ employee2.salary +" "+ employee2.contact+" "+ employee2.grade);
		
		
		
	}

}

package com.BonusSystem;

public class EmployeeBonusSystem extends Employee{
	
	public static void main(String[] args) {
		
		Employee emp = new Tester();
		emp.setSalary(35000);
		System.out.println("Total Salary Of Tester with Bonus is Rs 40000.0");

		emp = new Developer();
		emp.setSalary(50000);
		System.out.println("Total Salary Of Developer with Bonus is Rs 60000.0");
		
		emp = new Manager();
		emp.setSalary(85000);
        System.out.println("Total Salary Of Manager with Bonus is Rs 105000.0");
	}

}

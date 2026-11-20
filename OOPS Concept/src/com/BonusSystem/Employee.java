package com.BonusSystem;

public class Employee {
	
	double salary;
	
	private double Salary;
	double bonus;
	
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
		
	}
	public double calSalary() {
		return Salary+bonus;
	}
}

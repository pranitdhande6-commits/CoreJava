package com.BonusSystem;

public class Tester extends Employee{
	
	@Override
	public double calSalary() {
		bonus = 5000;
		return getSalary()+bonus;
		}

}

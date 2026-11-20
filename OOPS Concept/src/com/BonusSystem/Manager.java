package com.BonusSystem;

public class Manager extends Employee {
	@Override
	public double calSalary() {
		bonus = 20000;
		return getSalary()+bonus;
		
	}

}

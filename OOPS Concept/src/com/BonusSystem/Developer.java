package com.BonusSystem;

public class Developer extends Employee{
	
    @Override
    public double calSalary() {
    	bonus = 10000;
    	return getSalary()+bonus;
    	
    }
    

}

package com.MultilevelInheritence;

public class Son extends Parent{
	
	int k = 17;
	String name = "Ram";
	
	public void m3() {
		System.out.println("==M3 Method==");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();
		System.out.println(s.i);
		System.out.println(s.iname);
		System.out.println(s.j);
		System.out.println(s.jname);
		System.out.println(s.k);
		System.out.println(s.name);
		s.m1();
		s.m2();
		s.m3();
		
	}

}

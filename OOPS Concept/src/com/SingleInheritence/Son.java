package com.SingleInheritence;

public class Son extends Parent{
	
	int j = 25;
	String name = "Aarush";
	
	public void m2()
	{
		System.out.println("==M2 Method==");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();
		System.out.println(s.i);
		System.out.println(s.name);
		System.out.println(s.j);
		System.out.println(s.name);
		s.m1();
		s.m2();
		
	}

}

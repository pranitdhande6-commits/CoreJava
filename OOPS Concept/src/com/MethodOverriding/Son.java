package com.MethodOverriding;

public class Son extends Parent{
	int j = 200;
	
	@Override
	public void m1() {
		System.out.println("Override M1 Method Son Class");
	}
	
	public void m3() {
		System.out.println("M3 Method Of Son");
		
	}
	public static void main(String[] args) {
		
		Parent p = new Parent();
		System.out.println(p.i);
		p.m1();
		p.m2();
		System.out.println("Mix Object Parent Son");
		
		Parent p1 = new Son();
		p1.m1();
		p1.m2();
		System.out.println(p1.i);
		
		System.out.println("Son Class");
		Son s = new Son();
		s.m1();
		s.m2();
		s.m3();
		System.out.println(s.j);
		
		
		
	}
	

}

package com.InterfaceExample;

public class ClassR implements IntrefaceI{

	public static int y = 197;
	
	@Override
	public void m1() {
		System.out.println("Implements Method of m1");
	}
	
	@Override
	
	public void m2() {
		
		System.out.println("Implement Method of M2");
	}
	
	public void m3() {
		
		System.out.println("ClassR Own Method");
	}
	
	
	
	public static void main(String[] args) {
		
		InterfaceI i = new ClassR();
		
		System.out.println(i.y);
		System.out.println(i.x);
		i.m1();
		i.m2();
		
		ClassR r = new ClassR();
		System.out.println("Implemented Object of Class");
		r.m1();
		r.m2();
		r.m3();
		System.out.println(r.y);
		System.out.println(r.x);
				
		
	}
	
	
}

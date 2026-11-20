package com.HierarchicalInheritence;

public class Son2 extends Parent{
	
	int k = 78;
	String kname = "Chetan";
	
	public void m3() {
		System.out.println("===M3 Method===");
	}
	
	public static void main(String[] args) {
		Son1 s1 = new Son1();
		System.out.println(s1.j);
		System.out.println(s1.jname);
		Son2 s = new Son2();
		System.out.println(s.i);
		System.out.println(s.iname);
		System.out.println(s.k);
		System.out.println(s.kname);
		s.m1();
		s1.m2();
		s.m3();
		
	}
	

}

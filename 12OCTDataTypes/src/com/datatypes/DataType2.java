package com.datatypes;
/**
 * 
 * @author Pranit
 *
 */
public class DataType2 {
	byte b = 78;
	short s = 2005;
	int i = 414402;
	long l = 700332378;
	float f = 76.50f;
	double d = 2379.789;
	boolean flag = false;
	char c = 'R';
	
	String name = "Prakash";
	static
	{
		System.out.println("== static block ==");
		
	}
	DataType2()
	{
		System.out.println("==<< Default Constructor >>==");
	}
	
	
	{
		System.out.println("==== Non Static Block ====");
	}
	
	public void m1()
	{
		System.out.println("==method m1==");
		byte b1 = 70;
		short s1 = 2006;
		int i1 = 414403;
		long l1 = 700332370;
		float f1 = 87.48f;
		double d1 = 587.879;
		boolean flag1 = true;
		char c1 = 'S';
		String name = "Om";
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(flag1);
		System.out.println(c1);
		System.out.println(name);
	}
		
	public static void main (String[] args)
	{
		System.out.println("==Main Method==");
		DataType2 data = new DataType2();
		System.out.println(data.b);
		System.out.println(data.s);
		System.out.println(data.i);
		System.out.println(data.l);
		System.out.println(data.f);
		System.out.println(data.d);
		System.out.println(data.flag);
		System.out.println(data.c);
		System.out.println(data.name);
		data.m1();
	}

}

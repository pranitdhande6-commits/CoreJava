package com.staticnonstatic;

/**
 * 
 * @author Pranit
 *
 */
public class StaticnonStatic {
	
	static {
		StaticnonStatic stn = new StaticnonStatic();
		stn.m1();
		System.out.println("==Static Block==");	
	}
		
	StaticnonStatic()
	{
		
		System.out.println("===Default Constructor===");

	}
		
		{	
			System.out.println("==<Non Static Block >==");
		}
		
		public void m1()
		{
			System.out.println("==Method m1 ==");
			StaticnonStatic stn = new StaticnonStatic();
		}
		public static void main(String[] args)
		{
			System.out.println("==Main Method ==");
			StaticnonStatic stn = new StaticnonStatic();
			stn.m1();
		}
		}
		
		
		
	
	


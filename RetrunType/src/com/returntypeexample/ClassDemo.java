package com.returntypeexample;

public class ClassDemo {
	
	public void m1()
	{
		System.out.println("===M1 Method===");
		
	}
	public int m2(){
		
		System.out.println("====M2 Method ==== ");
		return 20;
	}
	public String m3()
	{
		System.out.println("===M3 Method===");
		return "Vivek";
	}
	public double m4()
	{
		System.out.println("====M4 Method===");
		return 234.756;
		
	}
	public boolean m5()
	{
		System.out.println("===M5 Method===");
		return true;
		
	}
	public char m6()
	{
		System.out.println("=== M6 Method ===");
		return 'R';
	}
	public Employee addemployee()
	{
		Employee emp = new Employee();
		
		emp.eid = 36;
		emp.ename= "Saurabh";
		emp.Salary = 25000.87;
		
		return emp;
		
	}
	public Comapany addcomapany()
	{
		Comapany com = new Comapany();
		com.cid = 12;
		com.cname = "Tata Motors";
		com.caddress = " Chikhali Pune";
		return com;
	}

   
public static void main (String[] args)
{
	ClassDemo csd = new ClassDemo();
	Employee emp = csd.addemployee();
	//System.out.println(emp.eid+" "+emp.ename+" "+ emp.Salary);
	System.out.println(emp);
	Comapany com = csd.addcomapany();
	//System.out.println(com.cid+" "+com.cname+" "+com.caddress);
	System.out.println(com);
	csd.m1();
	csd.m1();
	int i =csd.m2();
	System.out.println(i);
	String R = csd.m3();
	System.out.println(R);
	double d = csd.m4();
	System.out.println(d);
	boolean flag = csd.m5();
	System.out.println(flag);
	char A = csd.m6();
	System.out.println(A);
	
	
	
	
}
}

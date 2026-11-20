
public class Student {
	int id = 79;
	String name = "Ashok";
	String Address = "Pune";
	
  public void m1()
  {
	int J = 7012;
	System.out.println("=== Method 1===");
	System.out.println(J);
	
	  
  }
  public static void main(String[] args) {
	  System.out.println("==<<Main Method >>==");
	Student std = new Student();
	System.out.println(std.id);
   System.out.println(std.name);
   System.out.println(std.Address);
	std.m1();
}
  }


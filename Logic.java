class Logic
 {
 int rollNo;
 String name = "Pratik";

 Logic ()
{

  System.out.println("==== Default Constructor ====");


}
public void m1()
{
int D = 109;
System.out.println("===method 1===");
System.out.println(D);
}

public static void main(String[] args)
{
 System.out.println("===Main Method===");
 Logic l = new Logic();
 System.out.println(l.rollNo);
 System.out.println(l.name);
 l.m1();

}
}
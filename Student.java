class Student
{
 
public void run()
{
 System.out.println("student run");
}

public void eatFood()
{
 System.out.println("eat food");

}
public static void main(String[] args)
{
  Student std = new Student ();
  std.run();
  std.eatFood();

}
}
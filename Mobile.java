class Mobile 
{
  int price;
Mobile()
{
 System.out.println("==Deafualt Constructor==");

}

public void makeCall()
{
System.out.println("calling person");
}
public void takePicture()
{
System.out.println("Captured picture");
}
public static void main (String[] args)
{
 Mobile mo = new Mobile();
 mo.makeCall();
 mo.takePicture();
System.out.println(mo.price);

}

}
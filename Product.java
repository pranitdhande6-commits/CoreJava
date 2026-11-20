class Product
{
   int pid = 18;
   String name = "Mobile";
   int price = 177000;

public void displayProduct()
{
System.out.println("===Product Details===");
Product pt = new Product();

System.out.println(pt.pid);
System.out.println(pt.name);
System.out.println(pt.price);
} 
public void displayOrder()
{
 int oid = 7030;
 String custName = "Pranit";
 String address = "PCMC";
System.out.println("===displayOrder method===");

System.out.println(oid);
System.out.println(custName);
System.out.println(address);
}
public static void main(String[] args)
{
Product pt = new Product();
pt.displayProduct();
pt.displayOrder();
}
}
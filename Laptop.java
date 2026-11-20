class Laptop
{
 public void displayRam()
{
 System.out.println("256gb Ram");
}

 public void displayKeyboard()
{
 System.out.println("Well Spaced keys");
}
public static void main(String[] args)
{
  Laptop lap = new Laptop();
  lap.displayRam();
  lap.displayKeyboard();

}
}
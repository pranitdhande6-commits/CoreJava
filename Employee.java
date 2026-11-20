class Employee
{

public void displayEmployeeDetails()
{
System.out.println("Name - Pranit Dhande,");
System.out.println("ID 101");
System.out.println("ADD Pune");

}

public void displayCompanyDetails()
{
 System.out.println("Company - Infosys,");
 System.out.println("Id 1730");
 System.out.println("ADD PCMC");
} 


public static void main(String[] args)
{
Employee em = new Employee();

em.displayEmployeeDetails();
em.displayCompanyDetails();
}


}
package CoreJavaTasks.com.company.corejava;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 SoftwareEngineer softwareEngineer = new SoftwareEngineer(1,38459, "John", 206, "street 1", "City 1", "India", "Telangana");
         softwareEngineer.printDetails();

         System.out.println("*************");

         JuniorEngineer juniorEngineer = new JuniorEngineer(2,545643, "Stephen", 306, "street 2", "City 2", "India", "Telangana");
         juniorEngineer.printDetails();

         System.out.println("*************");

         Trainer trainer = new Trainer(3,7455654, "Abraham", 406, "street 3", "City 3", "India", "Telangana");
         trainer.printDetails();


         System.out.println("*************");
    }
}

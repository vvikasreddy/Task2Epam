package CoreJavaTasks.com.company.corejava;

public class SoftwareEngineer extends Employee{

    private String projectName;
    public SoftwareEngineer(int id, double salary, String name,int floorNumber, String streetName, String cityName, String country, String state){
        super(id, salary, name,floorNumber, streetName, cityName, country, state);
        this.projectName = projectName;
    }

    @Override
    public void printDetails(){


        System.out.println("The method is being over ridden ");
        System.out.println("The id of the employee is : " + this.id);
        System.out.println("The salary of the employee is : " +  this.salary);
        System.out.println("The name of the employee is : " + this.name);
        System.out.println(String.format("The name of the floor is %s, street is %s, and the state is %s ", this.address.floorNumber, this.address.streetName, this.address.cityName));
    }
}

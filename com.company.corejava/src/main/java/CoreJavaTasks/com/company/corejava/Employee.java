package CoreJavaTasks.com.company.corejava;

public class Employee extends Course{

    int id;
    String name;
    double salary;
    Address address;
    public Employee(int id, double salary, String name,int floorNumber, String streetName, String cityName, String country, String state){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.address = new Address(floorNumber, streetName, cityName, country, state);
    }

    public void printDetails(){

        System.out.println("The id of the employee is : " + this.id);
        System.out.println("The salary of the employee is : " +  this.salary);
        System.out.println("The name of the employee is : " + this.name);
        System.out.println(String.format("The name of the floor is %s, street is %s, and the state is %s ", this.address.floorNumber, this.address.streetName, this.address.cityName));
    }

}

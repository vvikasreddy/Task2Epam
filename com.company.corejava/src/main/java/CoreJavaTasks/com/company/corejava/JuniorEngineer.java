package CoreJavaTasks.com.company.corejava;

public class JuniorEngineer extends Employee {
    private String assesmentScore;
    private String feedback;

    public JuniorEngineer(int id, double salary, String name,int floorNumber, String streetName, String cityName, String country, String state) {

        super(id, salary, name,floorNumber, streetName, cityName, country, state);
        this.assesmentScore = assesmentScore;
        this.feedback = feedback;
    }


}

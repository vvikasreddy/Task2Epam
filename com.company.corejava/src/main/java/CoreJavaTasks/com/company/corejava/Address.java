package CoreJavaTasks.com.company.corejava;

public  class Address {
    int floorNumber;
    String streetName;
    String cityName;
    String country;
    String state;

    Address(int floorNumber, String streetName, String cityName, String country, String state){
        this.cityName = cityName;
        this.country = country;
        this.state = state;
        this.floorNumber = floorNumber;
        this.streetName = streetName;
    }
}

package GenericTasks.com.company.genericTasks;

public class Customer implements Comparable<Customer> {

    private String customerName;
    private double customerSalary;



    @Override
    public String toString() {
        return customerName + " " +  customerSalary;
    }

    public Customer(String customerName, double customerSalary) {
        super();
        this.customerName = customerName;
        this.customerSalary = customerSalary;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCustomerSalary() {
        return customerSalary;
    }

    @Override
    public int compareTo(Customer that) {

        if (this.customerSalary > that.customerSalary) return 1;
        return -1;

    }
}
package CollectionsTasks2.com.company.collectionstasks2;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class TaskImplementation {

    // Task 1 method
    public int[] maleAndFemaleCount(List<Employee> employeeList) {
        int male = 0, female = 0;

        for (Employee employeeCounter : employeeList) {
            if (employeeCounter.getGender().equals("Male")) {
                male += 1;
            } else {
                female += 1;
            }
        }


        return new int[]{male, female};

    }

    ;

    // Task 2 method
    public void getDepartments(List<Employee> employeeList) {

        HashSet<String> departments = new HashSet<>();

        for (Employee employee : employeeList) {
            if (!departments.contains(employee.getDepartment())) {
                departments.add(employee.getDepartment());
            }

        }

        System.out.println("the departments are ");
        for (String eachDepartment : departments) {
            System.out.println(eachDepartment);
        }
        System.out.println("********************");
    }

    // Task 3 method
    public void avgAgeOfMaleAndFemale(List<Employee> employee) {

        int femaleCount = 0, maleCount = 0;
        int ageMaleCount = 0, ageFemaleCount = 0;

        for (Employee employeeCounter : employee) {
            if (employeeCounter.getGender().equals("Male")) {
                maleCount += 1;
                ageMaleCount += employeeCounter.getAge();
            } else {
                femaleCount += 1;
                ageFemaleCount += employeeCounter.getAge();
            }
        }

        double averageMaleAge, averageFemaleAge;
        averageMaleAge = (double) ageMaleCount / (double) maleCount;
        averageFemaleAge = (double) ageFemaleCount / (double) femaleCount;

        System.out.println("The average male age is " + averageMaleAge);
        System.out.println("The acerage female age is " + averageFemaleAge);
        System.out.println("********************");
    }

    // task 4 method
    public void highestPaidEmployee(List<Employee> employee) {

        Employee highestSalaryDetails = employee.get(0);

        for (Employee employeeCounter : employee) {

            if (employeeCounter.getSalary() > highestSalaryDetails.getSalary()) {
                highestSalaryDetails = employeeCounter;
            }
        }

        System.out.println("The highest salary is " + highestSalaryDetails.getSalary() + " The name" +
                "of the employee is " + highestSalaryDetails.name);

        System.out.println("********************");
    }

    // task 5 method
    public void employeesJoinedAfter2015(List<Employee> employee) {
        ArrayList<String> employeeNamesJoinedAfter2015 = new ArrayList<>();
        for (Employee employeeCounter : employee) {
            if (employeeCounter.getYearOfJoining() > 2015) {
                employeeNamesJoinedAfter2015.add(employeeCounter.getName());
            }
        }

        System.out.println("The names of employees joined after 2015 are " + employeeNamesJoinedAfter2015);
        System.out.println("********************");
    }

    // task 6 method
    public Hashtable<String, Integer> employeesInEachDepartment(List<Employee> employeeList) {

        Hashtable<String, Integer> employeeDepartmentHashtable = new Hashtable<>();

        for (Employee employee : employeeList) {
            if (employeeDepartmentHashtable.containsKey(employee.getDepartment())) {
                employeeDepartmentHashtable.put(employee.getDepartment(), employeeDepartmentHashtable.get(employee.getDepartment()) + 1);
            } else {
                employeeDepartmentHashtable.put(employee.getDepartment(), 1);
            }
        }

        return employeeDepartmentHashtable;
    }

    // task 7 method
    public void averageSalaryPerDepartment(List<Employee> employeeList) {

        Hashtable<String, Double> totalSalaryForDepartment = new Hashtable<>();
        for (Employee employee : employeeList) {

            if (totalSalaryForDepartment.containsKey(employee.getDepartment())) {
                totalSalaryForDepartment.put(employee.getDepartment(), totalSalaryForDepartment.get(employee.getDepartment()) + employee.getSalary());
            } else {
                totalSalaryForDepartment.put(employee.getDepartment(), employee.getSalary());
            }
        }

        Hashtable<String, Integer> employeeDepartmentHashtable = this.employeesInEachDepartment(employeeList);

        Hashtable<String, Double> avgSalaryPerDepartment = new Hashtable<>();


        for (String department : employeeDepartmentHashtable.keySet()) {
            System.out.println(totalSalaryForDepartment.get(department) + department + employeeDepartmentHashtable.get(department));

            avgSalaryPerDepartment.put(department, (double) totalSalaryForDepartment.get(department) / employeeDepartmentHashtable.get(department));
        }

        System.out.println(avgSalaryPerDepartment);
        System.out.println("********************");
    }

    // task 8 method
    public void youngEmployeeInProductDepartment(List<Employee> employeeList) {

        int age = Integer.MAX_VALUE;
        Employee employeeMinAge = null;

        for (Employee employee : employeeList) {
            if (employee.getDepartment().equals("Product Development")) {
                if (age == Integer.MAX_VALUE) {
                    employeeMinAge = employee;
                    age = employee.getAge();
                } else if (age > employee.getAge()) {
                    age = employee.getAge();
                    employeeMinAge = employee;
                }
            }
        }

        System.out.println("The Employe with minimum age in product development is " + employeeMinAge);
        System.out.println("********************");
    }

    //task 9 method
    public void mostExperience(List<Employee> employeeList) {

        int joiningDate = Integer.MAX_VALUE;
        Employee employeeMaxExperience = null;

        for (Employee employee : employeeList) {
            if (joiningDate > employee.getYearOfJoining()) {
                joiningDate = employee.getYearOfJoining();
                employeeMaxExperience = employee;
            }
        }

        System.out.println("The details of the most experienced employee is " + employeeMaxExperience);
        System.out.println("********************");
    }

    // task 10 method
    public void maleAndFemaleEmployeesInSalesAndMarketing(List<Employee> employeeList) {

        int maleCount = 0, femaleCount = 0;

        for (Employee employee : employeeList) {
            if (employee.getDepartment().equals("Sales And Marketing")) {
                if (employee.getGender().equals("Male")) maleCount += 1;
                else femaleCount += 1;
            }
        }

        System.out.println("The count of male employees are " + maleCount + " female count is " + femaleCount);
        System.out.println("********************");
    }

    // task 11 method
    public void averageSalaryOfMalesAndFemales(List<Employee> employeeList) {
        int[] maleFemaleCount = this.maleAndFemaleCount(employeeList);
        double maleTotalSalary = 0, femaleTotalSalary = 0;
        for (Employee employee : employeeList) {
            if (employee.getGender().equals("Male")) {
                maleTotalSalary += employee.getSalary();
            } else femaleTotalSalary += employee.getSalary();
        }

        double maleAverageSalary = (double) maleTotalSalary / maleFemaleCount[0];
        double femaleAverageSalary = (double) femaleTotalSalary / maleFemaleCount[1];

        System.out.println("The average salary of male employees is " + maleAverageSalary + " female employees is " + femaleAverageSalary);
        System.out.println("********************");
    }

    // task 12 method
    public void namesPerDepartment(List<Employee> employeeList) {
        Hashtable<String, ArrayList<String>> hashtableOfEmployees = new Hashtable<>();
        for (Employee employee : employeeList) {
            if (!hashtableOfEmployees.containsKey(employee.getDepartment())){
                hashtableOfEmployees.put(employee.getDepartment(), new ArrayList<String>());
                hashtableOfEmployees.get(employee.getDepartment()).add(employee.getName());
            }
            else{
            hashtableOfEmployees.get(employee.getDepartment()).add(employee.getName());
        }
        }
        System.out.println(hashtableOfEmployees);
        System.out.println("********************");
    }

    // task 13 method
    public void averageAndTotalSalaryOfTheDepartment(List<Employee> employeeList){
        double totalSalary = 0;
        int totalEmployees = 0;
        for (Employee employee: employeeList){
            totalSalary += employee.getSalary();
            totalEmployees+=1;
        }

        double averageSalary = (double) totalSalary/ totalEmployees;

        System.out.println("The averageSalary is " + averageSalary);
        System.out.println("********************");
    }

    //task 14 method
    public void aboveAndBelowAge25(List<Employee> employeeList){

        ArrayList<Employee> employeeBelow25Age = new ArrayList<>();
        ArrayList<Employee> employeeAbove25Age = new ArrayList<>();

        for (Employee employee:employeeList){
            if (employee.getAge() >= 25){
                employeeAbove25Age.add(employee);
            }
            else{
                employeeBelow25Age.add(employee);
            }
        }

        System.out.println("The employee names below 25 years of age" + employeeBelow25Age);
        System.out.println("The employee names above 15 years of age" + employeeAbove25Age);
        System.out.println("********************");
    }

    // task 15 method
    public void oldestEmployee(List<Employee> employeeList){

        Employee eldestEmployee = employeeList.get(0);
        for (Employee employee: employeeList){
            if (eldestEmployee.getAge() < employee.getAge()){
                eldestEmployee = employee;
            }
        }

        System.out.println("The age of the eldestEmployee is " + eldestEmployee.getAge() + "and the department is " + eldestEmployee.getDepartment());
        System.out.println("********************");
    }
}

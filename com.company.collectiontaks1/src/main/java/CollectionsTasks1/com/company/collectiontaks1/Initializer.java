package CollectionsTasks1.com.company.collectiontaks1;


import java.util.Arrays;
import java.util.List;

public class Initializer {

    List<Integer> numberList;
    List<String> employeeList;

    public Initializer(){
        this.numberList =  Arrays.asList(4,5,3,2,45);
        this.employeeList =  Arrays.asList("alice", "bobby", "cathy");
        System.out.println();
    }

    public List<Integer> listLoader(){
        return numberList;
    }

    public List<String> employeeListLoader(){

        return employeeList;
    }


}

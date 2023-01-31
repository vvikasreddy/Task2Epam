package CollectionsTasks1.com.company.collectiontaks1;

public class Employee {
    String name;
    int age;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return this.name + "-" + this.age;
    }
}


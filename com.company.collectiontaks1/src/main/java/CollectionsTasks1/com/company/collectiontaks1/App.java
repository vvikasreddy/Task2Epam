package CollectionsTasks1.com.company.collectiontaks1;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	TaskMethods taskImplementation = new TaskMethods();
        Initializer initializer = new Initializer();


        //task 1
        System.out.println(taskImplementation.secondBiggestNumber(initializer.listLoader()));
        System.out.println("-------------***************-------------------");

        //task 2
        System.out.println(taskImplementation.sortReverse(initializer.listLoader()));
        System.out.println("-------------***************-------------------");

        //task 3
        System.out.println("The elements in list after sorting are : " + taskImplementation.sortEmployeeReverse( initializer.employeeListLoader()));
        System.out.println("-------------***************-------------------");


        // task 4
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(4);
        System.out.println("The elements in the treeSet " + treeSet);
        System.out.println("-------------***************-------------------");

    // task 5
        Set<Employee> set = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                return a.name.compareTo(b.name);
            }
        });
        set.addAll(Arrays.asList(new Employee("John", 30), new Employee("Alex", 25), new Employee("Mark", 40), new Employee("Bob", 35)));
        System.out.println(set);
        System.out.println("-------------***************-------------------");


        // task6

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("vikas", 1);
        treeMap.put("harish", 2);

        Map<String, Integer> mpMap;
        mpMap = taskImplementation.valueSort(treeMap);

        System.out.println(mpMap);
        System.out.println("-------------***************-------------------");

        //task 7

        TreeMap<Employee, Integer> treeMap1 = new TreeMap<>((o1, o2) -> o1.name.equals(o2.name)?-1:1) ;
        treeMap1.put(new Employee("Vikas", 2343), 1);
        treeMap1.put(new Employee("harish", 323), 2);


        for (Map.Entry<Employee, Integer> mp: treeMap1.entrySet() ) {
            System.out.print(mp.getKey().name + "  ");
        }

        System.out.println('\n' + "-------------***************-------------------");


        // task 8
        List<String> employeeList = initializer.employeeListLoader();
        Collections.sort(employeeList, Collections.reverseOrder());
        System.out.println("list after sorting is " + employeeList);
    }
}

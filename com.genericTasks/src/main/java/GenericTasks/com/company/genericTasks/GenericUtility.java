package GenericTasks.com.company.genericTasks;

public class GenericUtility {
	
	//Non-Generic Method
    /*
     * Convert this non-generic method to a generic method so that it can
     * compare String, Double, Float and any custom class object like
     * in our case i.e Customer
     */


    public static <T extends  Comparable<T>> void receiveLeastValue(T o1, T o2){

                if (o2.compareTo(o1) > 0){
                    System.out.println(o1);
                }

        System.out.println(o2);


    }
}

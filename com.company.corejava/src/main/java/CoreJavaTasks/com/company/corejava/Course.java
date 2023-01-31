package CoreJavaTasks.com.company.corejava;

import java.util.Hashtable;
import java.util.Map;

public class Course {

    int courseId;
    String courseName;
    int courseDuration;

    public Course(){};
    public Course(int courseId, String courseName, int courseDuration){
        this.courseDuration = courseDuration;
        this.courseName = courseName;
        this.courseId = courseId;
    }
    String day;
    int K;

    String startDay;

    public String Task5(String day, int k){

        day = day.toLowerCase();
        Hashtable<String, Integer> dayWeek = new Hashtable();
        dayWeek.put("sunday",1);
        dayWeek.put("monday",2);
        dayWeek.put("tuesday",3);
        dayWeek.put("wednesday",4);
        dayWeek.put("thursday",5);
        dayWeek.put("friday",6);
        dayWeek.put("saturday",7);

        k = ((int) dayWeek.get(day) + k)%7;

        for (Map.Entry<String, Integer> entry: dayWeek.entrySet()){
            if (entry.getValue() == k) {this.startDay = entry.getKey();
                break;
            }
        }
        return startDay;
    }


}

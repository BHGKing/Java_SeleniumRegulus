package MilenaTask.week9;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveAhmed {
    public static void main(String[] args) {

   /*
      Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'
    */
        ArrayList<String> names=new ArrayList<>();
names.add("Ahmed");
names.add("John");
names.add("Eric");
names.add("Ahmed");
        System.out.println(names);
        ArrayList<String>remove=new ArrayList<>();

        for (String each : names) {
            if (names.contains("Ahmed")){
                continue;
            }
         remove.add(each);
        }
        names.removeAll(Collections.singleton("Ahmed"));
        System.out.println(names);

    }
}

package maiyadaTask.week09_JavaTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {
    /*
    ArrayList - Remove "Ahmed"
  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'
     */

    public static List<String> removeAhmed(List<String> names){

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            if(iterator.next().equals("Ahmed")){
                iterator.remove();
            }
        }
       return names;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        List<String> names1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed","Ahmed","Adam","John"));

        System.out.println(removeAhmed(names));
        System.out.println(remove2(names1));

    }

    public static List<String> remove2(List<String> names) {
        names.removeAll(Arrays.asList("Ahmed"));
        return names;
    }





}

package maiyadaTask.week09_JavaTask;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {
/*
    ArrayList - Remove some values
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

 */


    public static List<Integer> remove2(List<Integer> list){
        list.removeIf(p -> p > 100);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,101,190,32,500,79,200));
        System.out.println(remove2(nums));

    }
}

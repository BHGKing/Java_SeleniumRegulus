package MilenaTask.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSomeValues {
    public static void main(String[] args) {

/*
  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */
        int[] numbers= new int[]{1, 2, 3, 4, 5, 6,110,120};
        System.out.println(Arrays.toString(numbers));

        ArrayList<Integer>numbers2=new ArrayList<>();
        for (int each : numbers) {
            if(each>100){
                continue;
            }
            numbers2.add(each);
        }
        System.out.println(numbers2);
    }
}

package Week7;

import org.checkerframework.checker.units.qual.min;

public class FindMinNumber {

    public static void main(String[] args) {
        int[]array = {12,4,8,5,9};
        System.out.println(MinNumber(array));
    }
    public static int MinNumber(int[] arr) {

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];

            }
        }
return min;

    }

}
//
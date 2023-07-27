package MilenaTask.week9;

import java.util.Arrays;

public class ArrayConcatTwoArrays {

    //  Write a return method that can concatenate two arrays.

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;
    }
public static void main(String[] args) {
       int[]arr1={1,2,3,4,5};
       int[]arr2={6,7,8,9,10};
        System.out.println(Arrays.toString(concatTwoArrays(arr1, arr2)));
    }
}










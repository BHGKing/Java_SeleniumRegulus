package MilenaTask.week10;

import java.util.Arrays;

public class ArrayList_SortingInDescendingOrder {
/*
Write a method that can sort the ArrayList in descending order without
using the sort method.
 */
    public static int[] sortingArrayDesc(int[] arr) {

        int[] result= Arrays.copyOfRange(arr,0,arr.length);

         for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] > result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;

    }

    public static void main(String[] args) {
  int[]arr={7,52,4,15,102,83,24,86};
        System.out.println(Arrays.toString(sortingArrayDesc(arr)));
    }

}






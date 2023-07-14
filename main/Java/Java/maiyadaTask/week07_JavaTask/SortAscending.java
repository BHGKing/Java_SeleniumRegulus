package Java.maiyadaTask.week07_JavaTask;

import java.util.Arrays;

public class SortAscending {

/*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};

 */

    public static int[] sortAscending(int... arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1 ] = temp;

                }
              //  System.out.println(Arrays.toString(arr));

            }

        }


        return arr;
    }





    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7};
        System.out.println(Arrays.toString(sortAscending(array)));
    }

}

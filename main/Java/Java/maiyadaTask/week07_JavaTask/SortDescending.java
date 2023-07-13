package Java.maiyadaTask.week07_JavaTask;

import java.util.Arrays;

public class SortDescending {
    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */

    public static int[] descending(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] array = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(descending(array)));
    }


}

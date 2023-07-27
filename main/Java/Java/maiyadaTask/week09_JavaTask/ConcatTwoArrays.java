package maiyadaTask.week09_JavaTask;

import java.util.Arrays;

public class ConcatTwoArrays {

    public static int[] concatArray(int[] arr1, int[]arr2){

        int[] result = new int[arr1.length + arr2.length];

        // i -> add to the concat array, also read from the arr1
        // y -> read the element from the arr2
        for (int i = 0, y = 0; i < result.length; i++){

            if(i < arr1.length) {
                result[i] = arr1[i];
            }else {
                result[i] = arr2[y++];
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,4,5};
        int[] arr2 = {8,12,5,9};

        System.out.println(Arrays.toString(concatArray(arr1, arr2)));
    }

}
/*
 Array - Concat two arrays
  Write a return method that can concat two arrays.
 */
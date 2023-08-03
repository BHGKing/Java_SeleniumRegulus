package MilenaTask.week10;
import java.util.Arrays;
public class ArrayList_SortingInAscendingOrder {
    /*
    Write a method that can sort the ArrayList in Ascending order without using
the sort method.
     */

    public static int[] sortingArrayAsc(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[]arr={10,20,32,6,15,100,86};
        System.out.println(Arrays.toString(sortingArrayAsc(arr)));
    }
}

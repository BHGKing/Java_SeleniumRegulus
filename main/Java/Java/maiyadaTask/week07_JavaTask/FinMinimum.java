package Java.maiyadaTask.week07_JavaTask;



public class FinMinimum {

    /*
    Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */

    public static int minNum(int[] arr){

        int min = arr[0];

        for (int each : arr) {
            if(each < min){
                min = each;
            }

        }

        return min;


    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(minNum(arr));

    }




}

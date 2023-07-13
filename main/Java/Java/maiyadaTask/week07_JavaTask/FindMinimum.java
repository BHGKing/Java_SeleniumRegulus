package Java.maiyadaTask.week07_JavaTask;

public class FindMinimum {

    /*
    Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */

    public static int minimum(int []number){

        int min = number[0];


        for (int i = 0; i < number.length; i++) {
            if(number[i]< min){
                min = number[i];
            }

        }

        return min;
    }


    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(minimum(arr));
    }

}

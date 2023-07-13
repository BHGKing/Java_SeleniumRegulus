package Java.maiyadaTask.week06_JavaTask;

public class FindMaximum {


    /*
    Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */


    public static int maxNum(int[] a){

        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }

        }

        return max;


    }

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(maxNum(arr));



    }
}

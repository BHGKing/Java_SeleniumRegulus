package Java.maiyadaTask.week08_JavaTask;

import java.util.Arrays;

public class Move_Zeros_to_the_End {

    /*
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
  Example:
    input; [1, 0, 2, 0, 3, 0, 4, 0]
    output:[1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static int[] moverZeros(int[] nums) {

        int[] moved = new int[nums.length];
        int index = 0;

        for (int each : nums) {
            if(each != 0){
               moved[index++] = each;
            }
        }




        return moved;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println(Arrays.toString(moverZeros(arr)));
    }

}

package week8;


import java.util.Arrays;

public class MoveZeros {
    public static void main(String[]args){
    int []exercise= {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println(Arrays.toString(MoveZeros(exercise)));
}
    public static int[] MoveZeros(int[] exercise){
        int count = 0;
        int result [] = new int[exercise.length];

        for (int i = 0; i <exercise.length; i++) {

            if(exercise[i]!=0){
               result[count++] = exercise[i];
        }

        }
return  result;
    }
}
//Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
//  Example:
//    input; [1, 0, 2, 0, 3, 0, 4, 0]
//    output:[1, 2, 3, 4, 0, 0, 0, 0]
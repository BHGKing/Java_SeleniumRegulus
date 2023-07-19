package SahipjamalTask.Week06;

import java.util.Scanner;

public class Array_FindMaximum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: (numbers you want to input)");
        int count = input.nextInt();

        int[] num = new int[count];

        System.out.println("Enter the values:");
        for (int i = 0; i < count; i++) {
            num[i] = input.nextInt();
        }

        maxValue(num);

    }

    public static int maxValue(int[] num) {

        int max = Integer.MIN_VALUE;

        for (int each : num) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
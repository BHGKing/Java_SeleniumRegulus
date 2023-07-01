package JoseTask.Week02;

import java.util.Scanner;

public class SwapTwoVariables {
    public static void main(String a[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter second number: ");
        int y = scanner.nextInt();

        System.out.println("Before Swap:" + " x = " + x + ", y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping:" + " x = " + x + ", y = " + y);
    }
}
/*
1. Swap two variable values without using a third variable
 */
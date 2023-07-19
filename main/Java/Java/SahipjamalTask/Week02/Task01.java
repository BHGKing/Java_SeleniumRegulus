package SahipjamalTask.Week02;

import java.util.Scanner;

public class Task01 {

    /*Swap two variable values without using a third variable
 */

    public static void main(String[] args) {
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





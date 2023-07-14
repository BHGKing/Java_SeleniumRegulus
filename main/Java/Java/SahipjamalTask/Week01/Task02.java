package SahipjamalTask.Week01;

import java.util.Scanner;

public class Task02 {

    /*Write a method that can divide two numbers without using division operator
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int num3 = 0;
        int remainder = num1;

        while (remainder >= num2) {
            remainder -= num2;
            num3++;
        }

        System.out.println(num1 + "/" + num2 + " = " + num3);
        System.out.println("With a Remainder of: " + remainder);
    }
}



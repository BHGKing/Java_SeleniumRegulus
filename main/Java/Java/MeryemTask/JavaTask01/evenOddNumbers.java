package Java.Java.MeryemTask.JavaTask01;

import java.util.Scanner;

public class evenOddNumbers {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a valid number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The given number is even.");
        } else if (number % 2 != 0) {
            System.out.println("The given number is odd.");
        } else {
            System.out.println("Invalid number entered, please write a valid number!!");


        }
    }
}
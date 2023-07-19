package SahipjamalTask.Week01;

import java.util.Scanner;

public class Task01 {

    /*
1. Write a method which can identifies given number is even or odd
    EX:
    identify(5) - > "Odd"
    identify(6) - > "Even"
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

    }
    }


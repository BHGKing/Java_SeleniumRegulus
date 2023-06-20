package main.Java.Java.maiyadaTask.maiyadaTask.week03_JavaTask;

public class PrimeNumber {


    public static boolean isPrime(int number) {


        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                System.out.println(number + " is not a prime number");
                return false;
            }

        }

        System.out.println(number + " is prime number");

        return true;
    }

    public static void main(String[] args) {

        isPrime(23);


    }


}

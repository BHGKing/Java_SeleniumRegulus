package Java.maiyadaTask.week01_JavaTask;

public class DivideTwoNumbers {


    public static void main(String[] args) {


        int a = 50;
        int b =10;

        int count = 0;
        while (a >= b){
            a -=b;
            count++;
        }
        System.out.println(count + " with a reminder of "+ a);

    }
}

/*
Write a method that can divide two numbers without using division operator
 */
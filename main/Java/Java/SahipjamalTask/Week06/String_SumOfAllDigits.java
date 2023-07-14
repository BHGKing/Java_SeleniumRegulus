package SahipjamalTask.Week06;

public class String_SumOfAllDigits {

    public static void main(String[] args) {

        String str = "12 java 5 apple 3";

        System.out.println(getSumOfNumbers(str));

    }

    public static int getSumOfNumbers(String str){

        int total = 0;

        char[] ch = str.toCharArray();

        for (char each : ch){

            if (Character.isDigit(each) ){

                total += Integer.valueOf("" + each);

            }

        }

        return total;

    }

    /*
    public static int getSumOfNumbers(String s) {

        int sum = 0;

        String[] numbers = s.replaceAll("\\D+"," ").split(" ");

        for(String each : numbers){
            sum+=Integer.parseInt(each);
        }

        return sum;
    }

     */

}
/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */
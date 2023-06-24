package JoseTask.Week06;

public class String_SumOfAllDigits {

    public static int getSumOfNumbers(String s) {

        int sum = 0;

        String[] numbers = s.replaceAll("\\D+"," ").split(" ");

        for(String each : numbers){
            sum+=Integer.parseInt(each);
        }

        return sum;
    }

}
/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */
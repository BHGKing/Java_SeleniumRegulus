package main.Java.Java.maiyadaTask.maiyadaTask.week03_JavaTask;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
        System.out.println(reverseNum(-61));
        /*
        // int variable holding the value

        int num = -58;

        // variable that will hold the reversed number
        int reverse;

        String value = String.valueOf(num);
        String finalValue = "";

        // reversed loop that iterates backwards through the string
        for (int i = value.length()-1; i >= 0 ; i--) {

            finalValue += value.charAt(i);

        }
            // convert the string back to an integer
            reverse = Integer.parseInt(finalValue);

            // Print out the reversed int
            System.out.println("The number reversed is: " + reverse);

    }


         */
    }

    public static int reverseNum(int num) {


        String num1 = Integer.toString(num);
        String result = "";

        for (int i = num1.length()-1; i >= 1; i--) {

            result += num1.charAt(i);
        }
        int numResult = Integer.parseInt(result);

        return (numResult * (-1));
    }
}
package SahipjamalTask.Week05;

public class ReverseString {
    public static void main(String[] args) {

        String str = "ABCD";

        System.out.println("String = " + str);


        System.out.println("String Reversed = " + reverseString(str));

    }

    public static String reverseString(String str){

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);

        }
        return reverse;
    }

}
/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */
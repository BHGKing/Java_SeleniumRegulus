package Java.maiyadaTask.week05_JavaTask;

public class Reverse {

    //Write a function that can reverse a String
    // Ex: Reverse("ABCD"); ==> DCBA


    public static String StrReverse(String str){

        String reverse ="";
        for (int i = str.length()-1; i >=0 ; i--) {
           reverse += str.charAt(i);
        }


        return  reverse;
    }

    public static void main(String[] args) {
        System.out.println(StrReverse("ABCD"));
        System.out.println(StrReverse("QWER"));

    }
}

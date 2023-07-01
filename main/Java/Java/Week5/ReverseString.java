package Week5;

public class ReverseString {
    public static void main(String[] args) {

     String str = "ABCD";
     String reverse = "";

        for (int i = str.length()-1; i >= 0;  i--) {
            char ch = str.charAt(i);
            reverse+= ch;

        }
        System.out.println(reverse);
    }


}
//Write a function that can reverse a String
// Ex: Reverse("ABCD"); ==> DCBA
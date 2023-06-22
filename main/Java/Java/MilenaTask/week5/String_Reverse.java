package MilenaTask.week5;

public class String_Reverse {
    public static void main(String[] args) {

  /*
  Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
   */
    String str="ABCD";//DCBA
    String reverse="";
        for (int i =str.length()-1 ; i >=0 ; i--) {
            char ch=str.charAt(i);
       reverse+=str.charAt(i);

        }
        System.out.println(reverse);



    }
}

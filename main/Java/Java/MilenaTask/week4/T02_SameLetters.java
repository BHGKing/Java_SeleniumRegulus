package MilenaTask.week4;

public class T02_SameLetters {
    public static void main(String[] args) {

  /*
    Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
   */
String str="abc";
String str1="cab";
boolean same=true;
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            for (int j = 0; j <str1.length() ; j++) {
               // if(str.contains(str1)){
                if (str.charAt(i)==str.charAt(j)){
                  each +=j;
                }
            }
        }
        System.out.println(same);

    }
}

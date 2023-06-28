package MilenaTask.week5;

public class UniqueCharacter {
    public static void main(String[] args) {

  /*
    Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";

   */
        String str="AAABBBCCCDEF";//DEF
        String unique="";

        for (int i = 0; i <str.length() ; i++) {//i: index number of the str
            char each= str.charAt(i) ;
            if(str.indexOf(each)==str.lastIndexOf(each)){
                unique +=each;
            }
        }
        System.out.println(unique + "=unique");

    }
}
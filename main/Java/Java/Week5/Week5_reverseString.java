package Week5;

public class reverseString {
    public static void main(String[] args) {

        String str = "AAABBBCCCCCDEF";
        System.out.println(Week5_reverseString.UniqueCharacter(str));


    }

    public static String UniqueCharacter (String str ){

        String UniqueCharacter = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                UniqueCharacter+=ch;
            }

        }
        return UniqueCharacter;
    }



//        System.out.println(unique);
//Write a return method that can find the unique characters from the String
// Ex: unique("AAABBBCCCDEF") ==> "DEF";
}

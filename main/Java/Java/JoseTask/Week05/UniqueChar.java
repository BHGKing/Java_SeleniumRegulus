package JoseTask.Week05;

public class UniqueChar {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        System.out.println("String = " + str);

        System.out.println("Unique Characters from String = " + uniqueChars(str));


    }

    public static String uniqueChars(String str){

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

                if (str.indexOf(each) == str.lastIndexOf(each)){

                    unique += str.charAt(i);

                }

        }
        return unique;
    }

}
/*
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */
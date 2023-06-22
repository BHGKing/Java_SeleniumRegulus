package Java.maiyadaTask.maiyadaTask.week05_JavaTask;

public class FindUnique {

    //Write a return method that can find the unique characters from the String
    // Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static String unique(String str){
        String uniqueChar = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(str.indexOf(each)== str.lastIndexOf(each)){
                uniqueChar += each;
            }

        }

        return uniqueChar;
    }

    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }
}

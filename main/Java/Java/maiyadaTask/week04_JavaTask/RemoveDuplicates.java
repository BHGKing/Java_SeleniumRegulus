package Java.maiyadaTask.week04_JavaTask;

public class RemoveDuplicates {

    //Write a return method that can remove the duplicated values from the String
    //  Ex: removeDup("AAABBBCCC") ==> ABC

    public static String removeDuplicated(String str){

      String result = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if(result.indexOf(ch)==-1){
                result+=ch;
            }

        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(removeDuplicated("AAABBBCCC"));
    }



}

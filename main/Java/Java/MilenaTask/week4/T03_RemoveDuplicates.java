package MilenaTask.week4;

public class T03_RemoveDuplicates {
    public static void main(String[] args) {

    /*
    Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
     */
   String str ="AAABBBCCC";
   String result="";//ABC
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            if(!result.contains(each+"")){
        result+=each;


            }


        }
        System.out.println(result);

    }
}

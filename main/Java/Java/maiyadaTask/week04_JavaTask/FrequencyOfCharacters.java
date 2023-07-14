package Java.maiyadaTask.week04_JavaTask;

public class FrequencyOfCharacters {

   //Write a return method that can find the frequency of characters
    //  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void frequency(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int count = 0;

            for(int j = 0; j < str.length(); j++){
                char each = str.charAt(j);

                if(ch == each){
                    count++;
                }
            }
            if(result.contains(""+ ch)){
                continue;
            }
            result += ch;
            result += count;
        }

        System.out.println(result);

    }
    public static void main(String[] args) {


        frequency("AAABBCDD");


    }

}

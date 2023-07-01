package JoseTask.Week04;

public class frequency_of_chars {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        String str = "AAABBBCCC";//input.nextLine();

        frequencyOfChar(str);

    }

    public static void frequencyOfChar(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); // 0 (A) // 1 (A)
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j); // 0 (A) // 1 (A)

                if (ch == each){
                    count++;
                }

            }

            if (result.contains("" + ch)){
                continue;
            }

            result += ch;
            result += count;

        }

        System.out.println(result);

    }


}
/*
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
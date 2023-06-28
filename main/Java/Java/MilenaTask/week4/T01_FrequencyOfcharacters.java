package MilenaTask.week4;

public class T01_FrequencyOfcharacters {
    public static void main(String[] args) {

        String str="aaabbbbccccc";
        String result = ""; // a3b4c5

        for (int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;

                }
            }
            if (!result.contains(t+"")){
                result += (t+""+count);
            }
        }
        System.out.println(result);
    }
}







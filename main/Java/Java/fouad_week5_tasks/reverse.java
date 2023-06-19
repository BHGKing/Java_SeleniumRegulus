package fouad_week5_tasks;

public class reverse {

    public static String reverseString(String input){
        String result="";
        for (int i = input.length()-1;i>=0;i-- ){


            result+=input.charAt(i);

        }




        return result;

    }



}


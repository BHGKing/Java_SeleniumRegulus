package MilenaTask.week8;

public class ArrayMovesZerosToTheEnd {
    public static void main(String[] args) {
        int[]n={1, 0, 2, 0, 3, 0, 4, 0};
    }
    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;
    }
}


  /*
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
  Example:
    input; [1, 0, 2, 0, 3, 0, 4, 0]
    output:[1, 2, 3, 4, 0, 0, 0, 0]
   */

            



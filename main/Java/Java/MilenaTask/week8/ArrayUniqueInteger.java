package MilenaTask.week8;

public class ArrayUniqueInteger {
    public static void main(String[] args) {
/*
Write a function that given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array.
  Example 1:
    N = 4 => the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
Example 2:
    N = 3 => one of the possible answers is [-1, 0, 1] (but there are many more correct answers).
 */
        int[] numbers = {1, 1, 2, 3, 2, 4, 5, 5};
        String unique = "";
        for (int each1 : numbers) {
            int count = 0;
            for (int each2 : numbers) {
                count++;
            }
            if (count == 1) {
                System.out.println(each1);
            }

        }
    }






    }



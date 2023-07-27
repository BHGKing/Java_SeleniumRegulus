package Java.maiyadaTask.week08_JavaTask;

import java.util.Arrays;

public class Array_N_unique_integers {

    /*
    Write a function that given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array.
  Example 1:
    N = 4 => the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].

    The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).

  Example 2:
    N = 3 => one of the possible answers is [-1, 0, 1] (but there are many more correct answers).
     */


    public static int[] generateArray(int N) {
        int[] result = new int[N];

        // Generate the first N-1 numbers as -1, -2, -3, ..., -N+1
        for (int i = 0; i < N - 1; i++) {
            result[i] = -(i + 1);
        }

        // Calculate the value for the last element to ensure the sum is zero
        int sum = (N * (N - 1)) / 2;
        result[N - 1] = -sum;

        return result;
    }

    public static void main(String[] args) {
        int N = 3;
        int[] arr = generateArray(N);

        System.out.println(Arrays.toString(arr));
    }
}

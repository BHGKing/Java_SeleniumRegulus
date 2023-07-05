package JoseTask.Week02;

import java.util.Scanner;

public class SwapTwoVariables {

    //solution 1
    public static void swap1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


    //solution 2
    public static void swap2(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
1. Swap two variable values without using a third variable
 */
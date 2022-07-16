package maths;

import java.util.Scanner;

public class SumOf{
    public static void nOddNumbers(int range){
        int n=range;

        int count=0;
        for (int i=1; i<=n; i++){
            if (i%2==1){
                count=count+i;
            }
        }
        System.out.println("The sum is " + count);
    }
}

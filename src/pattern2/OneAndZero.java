package pattern2;

import java.util.Scanner;

public class OneAndZero {
    public static void BinaryTriangle(int len){
        int length=len;

        for (int i=1; i<=length; i++){
            for (int j=1; j<=i; j++){
                int counter = i+j;
                if (counter%2==0) {
                    System.out.print(1 + " ");
                }
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}

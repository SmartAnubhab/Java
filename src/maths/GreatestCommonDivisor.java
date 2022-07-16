package maths;

import java.util.Scanner;

public class GreatestCommonDivisor {
    /**
a=15 b=9 a=6
a=6 b=9 b=3
a=6 b=3 a=3

 */
    public static void gcd(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        while (a != b){
            if (a>b){
                a=a-b;
            }
            else
                b=b-a;
        }
        System.out.println("GCD is : " + b);

    }
}

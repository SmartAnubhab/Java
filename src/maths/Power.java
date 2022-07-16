package maths;

import java.util.Scanner;

public class Power {
    public static void powerOf(){
        System.out.println("Enter the number: ");
        Scanner scanner=new Scanner(System.in);
        int value=scanner.nextInt();

        System.out.println("Enter the power: ");
        int power=scanner.nextInt();

        int counter=1;
        for (int i=1; i<=power; i++){
            counter*=value;
        }
        System.out.println("Result is : " + counter);
    }
}

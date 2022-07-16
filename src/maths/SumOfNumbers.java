package maths;

import java.util.Scanner;

public class SumOfNumbers {
    public static void run(){
        System.out.println("Enter the range of numbers for which you want sum: ");
        Scanner scanner=new Scanner(System.in);
        int range=scanner.nextInt();

        int counter=0;
        System.out.println("Now enter those numbers: ");
        for (int i=1; i<=range; i++){
            counter += scanner.nextInt();
        }
        System.out.println("The sum is : " + counter);
    }
}

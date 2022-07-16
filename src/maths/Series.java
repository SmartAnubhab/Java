package maths;

import java.util.Scanner;

public class Series {
    public static void Fibonancci(){
        System.out.println("Enter the range for which you want to print fibonancci series: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int a=0, b=1, sum=0;

        for (int i=1; i<=n; i++){
            System.out.print(sum + " ");
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}

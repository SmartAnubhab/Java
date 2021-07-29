package Basics;
import java.util.Scanner;

public class BasicCalculator {
    Scanner scanner=new Scanner(System.in);
    int a;
    int b;
    int result;

    public void add(int a, int b){
        this.a=a;
        this.b=b;
        result=a+b;
        System.out.println("The sum is : "+result);
    }
}

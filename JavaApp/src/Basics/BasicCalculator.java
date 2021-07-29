package Basics;
import java.util.Scanner;

public class BasicCalculator {
    Scanner scanner=new Scanner(System.in);
    private int a;
    private int b;
    int result;

    public BasicCalculator(int a, int b){
        this.a=a;
        this.b=b;
    }

    public void add(){
        result=a+b;
        System.out.println("The sum is : " + result);
    }
    public void sub(){
        result=a-b;
        System.out.println("The sub is : " + result);
    }
    public void mul(){
        result=a*b;
        System.out.println("The multiplication is : " + result);
    }
    public void div(){
        result=a/b;
        System.out.println("The divition is : " + result);
    }
}

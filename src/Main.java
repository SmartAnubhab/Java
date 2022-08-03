import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("CALCULATOR: ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st value : ");
        int num1=scanner.nextInt();
        System.out.println("Enter 2nd value : ");
        int num2=scanner.nextInt();

        int result=num1+num2;

        System.out.println("Result is : " + result);
    }
}

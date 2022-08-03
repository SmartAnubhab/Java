import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("calculator:");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1=scanner.nextInt();
        System.out.println("Enter number 2 : ");
        int num2=scanner.nextInt();

        int result=num1+num2;

        System.out.println("Result is : " + result);
    }
}

package Index;
import Basics.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b;
        int result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        a=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second value: ");
        b=Integer.parseInt(scanner.nextLine());
        result=a+b;

        System.out.println("The result is : " + result);
    }
}

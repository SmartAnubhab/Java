package Basics;

import java.util.Scanner;

public class StringInputCalculator {
    int a,b;
    int result;
    Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.println("Enter the first value: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second value: ");
        b = Integer.parseInt(scanner.nextLine());
        result = a + b;

        System.out.println("The result is : " + result);

    }
}

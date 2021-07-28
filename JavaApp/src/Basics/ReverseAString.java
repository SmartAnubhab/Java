package Basics;
import java.util.Scanner;

public class ReverseAString {
    private String input;

    public void reverse(String input) {
        this.input=input;

        System.out.print("The reversed String is - \"");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.print("\"");
        System.out.println();
    }
}

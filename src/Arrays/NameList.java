package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NameList {
    public static void names(){
        System.out.println("How many names you want to print: ");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();

        String[] name = new String[size];

        System.out.println("Enter the names of people and type exit to end the entry process of names");
        for (int i=0; i<name.length; i++){
            name[i]=scanner.next();
        }
        System.out.println(Arrays.asList(name));

        for (int i=0; i<name.length; i++) {
            System.out.println(name[i]);
        }
    }
}

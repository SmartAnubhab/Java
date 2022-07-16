package maths;

import java.util.Scanner;

public class Eligibility {
    public static void toVote(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        if (age>=18){
            System.out.println("The person is eligiable to vote");
        }
        else {
            System.out.println("Not eligiable");
        }
    }
}

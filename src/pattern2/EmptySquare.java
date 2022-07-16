package pattern2;

import java.util.Scanner;

public class EmptySquare {
    public static void Square(){
        System.out.println("Lets make a empty Square here.");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of length ");
        int lenth=scanner.nextInt();


        for (int i=1; i<=lenth; i++){
            for (int j=1; j<=lenth; j++){
                if (i==1 || j==1 || i==lenth || j==lenth){
                    System.out.print("* ");
                }else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

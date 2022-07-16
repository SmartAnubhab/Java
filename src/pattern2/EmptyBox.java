package pattern2;

import java.util.Scanner;

public class EmptyBox {
    public static void Box(){
        System.out.println("Lets make a empty Box here.");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row: ");
        int row=scanner.nextInt();
        System.out.println("Enter column: ");
        int column=scanner.nextInt();

        scanner.close();
        for (int i=1; i<=row; i++){
            for (int j=1; j<=column; j++){
                if (i==1 || j==1 || i==row || j==column){
                    System.out.print("* ");
                }else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

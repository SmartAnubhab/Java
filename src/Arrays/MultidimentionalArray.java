package Arrays;

import java.util.Scanner;

public class MultidimentionalArray {
    public static void findIndices(int val, int arr[][]){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if (arr[i][j] == val)
                    System.out.println("row " + (i+1) + " | column " + (j+1));
            }
        }
    }



    public static void twoDimentionalArray(int row, int column){
        int[][] twoD=new int[row][column];

        Scanner scanner=new Scanner(System.in);

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                twoD[i][j] = scanner.nextInt();
            }
        }
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

    }
}

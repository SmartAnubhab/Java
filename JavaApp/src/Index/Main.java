package Index;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int[] arr=new int[5];
        Scanner scanner=new Scanner(System.in);

        for(int i=1; i<=5; i++) {
            System.out.println("ENTER THE NUMBER " + i + " : ");
            arr[i-1] = scanner.nextInt();
        }
        System.out.println("The stored values are : ");
        for (int a: arr){
            System.out.print(a + " ");
        }
    }
}

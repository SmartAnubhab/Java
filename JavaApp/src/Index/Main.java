package Index;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a number between 1 to 3");
        int a = scanner.nextInt();
        String month = null;
        switch(a){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            default:
                System.out.println("month is unknown");
        }
        if (month != null) {
            System.out.println(month);
        }

    }
}

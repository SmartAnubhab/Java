package Index;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("CALCULATOR");
        Scanner scanner=new Scanner(System.in);

        System.out.println("ENTER FIRST VALUE ");
        float value1=scanner.nextFloat();
        System.out.println("ENTER SECOND VALUE ");
        float value2=scanner.nextFloat();
        float result=value1+value2;
            System.out.println("THE RESULT IS " + result);

    }
}

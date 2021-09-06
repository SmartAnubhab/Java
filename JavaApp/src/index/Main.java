package index;
import sum.Sum;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("First number : ");
        float value1=scanner.nextFloat();
        System.out.println("Second numbe : ");
        float value2=scanner.nextFloat();
        Sum.add(value1, value2);

    }
}

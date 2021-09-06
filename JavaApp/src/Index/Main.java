package Index;

import java.util.Scanner;

class Sum{
    private static float sum(float x, float y){
        return x+y;
    }
    public static void add(float x, float y){
        System.out.println("The sum is : " + sum(x,y));
    }
}
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

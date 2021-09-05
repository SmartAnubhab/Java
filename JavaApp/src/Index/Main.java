package Index;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Object[] objects = new Object[5];
        objects[0] = "Anubhab Mondal";
        objects[1] = 123;
        objects[2] = 'A';
        objects[3] = 12.15;
        objects[4] = true;

        for (Object each: objects){
            System.out.println(each);
        }
        String[] words=new String[7];
        words[0] = "My";
        words[1] = "name";
        words[2] = "is";
        words[3] = "John";
        words[4] = "Cena";

        for (String word: words){
            System.out.print(word + " ");
        }
        System.out.println();
        words=new String[10];
        for (String word: words){
            System.out.print(word + " ");
        }
    }
}

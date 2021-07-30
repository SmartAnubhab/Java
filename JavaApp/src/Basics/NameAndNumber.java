package Basics;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class NameAndNumber {
    Map<String, Integer> name_number = new HashMap<>();
    public void start() {
        Scanner scanner=new Scanner(System.in);
        int count=name_number.size();

        while (scanner.hasNext()){
            name_number.put(scanner.next(), Integer.valueOf(scanner.next()));
            count++;
            if (count==5)
                break;
        }
    }
    public void print(){
        System.out.println("Your contacts are " + name_number);
    }
}

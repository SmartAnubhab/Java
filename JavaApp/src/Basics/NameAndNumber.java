package Basics;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class NameAndNumber {
    /**
     * This code needs to be fixed
     * need to make changes in functionality
     */
    Map<String, Integer> name_number = new HashMap<>();
    public void store() {
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

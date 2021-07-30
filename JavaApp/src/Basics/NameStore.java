package Basics;
import java.util.Scanner;
import java.util.ArrayList;

public class NameStore {

    public void start(){
        System.out.println("Enter names of your 5 Friends: ");
        ArrayList<String> names=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        int count=0;

        while (scanner.hasNext()){
            names.add(scanner.next());
            count++;
            if(count==5)
                break;
        }
        System.out.println("Your friends are " + names);
    }
}

package Index;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name="ANUBHAB";
        Scanner scanner=new Scanner(name);
        ArrayList<String> nameArray=new ArrayList<>();

        while(scanner.hasNext()){
            nameArray.add(scanner.next());
        }

        System.out.println(nameArray);

    }
}

package Index;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String sentence = "I love java, and I code in it";
        Scanner scanner=new Scanner(sentence);

        ArrayList<String> sentenceLine=new ArrayList<>();

        while(scanner.hasNext()){
            sentenceLine.add(scanner.next());
        }
        System.out.println(sentenceLine);

    }
}

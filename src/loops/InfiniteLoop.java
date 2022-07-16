package loops;

public class InfiniteLoop {
    public static void doWhile(){
        int counter = 1;
        do {
            try {
                System.out.println("loop running for " + counter + "th times");
                Thread.sleep(50);
            }catch (Exception e){
                System.out.println(e);
            }
            counter++;
        }while (counter>1);
    }
}

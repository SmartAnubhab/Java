package maths;

public class Factorials {
    public static void factorialOf(int number) {
        if (number < 0) {
            System.out.println("Invalid input");
            return;
        } else if (number == 0) {
            System.out.println(0);
        } else {

            int counter = 1;
            for (int i = number; i >= 1; i--) {
                counter = counter * i;
            /*
            4*1=4
             */
            }
            System.out.println("The factorial is " + counter);
        }
    }
}
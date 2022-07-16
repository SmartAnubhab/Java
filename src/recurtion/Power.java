package recurtion;

public class Power {
    /**
     * print x^n (stack height is n);
     */
    private static int result=1;
    public static void printXtoThePowerOfN(int x, int n){
        if (n==1){
            System.out.println(result*x);
            return;
        }
        result*=x;
        printXtoThePowerOfN(x,n-1);
    }
}

package recurtion;

public class Fibonacci {
    private static int result=0;
    public static void fibonacciSeries(int a, int b, int range){
        if (a==0 && b==1) {
            System.out.print(a + " " + b + " ");
        }
        if (result>range) {
            return;
        }
        result=a+b;
        a=b;
        b=result;
        if (result<=range)
            System.out.print(result + " ");
        fibonacciSeries(a,b,range);
    }

    public static void fibonacciRange(int a, int b, int term){
        if (a==0 && b==1) {
            System.out.print(a + " " + b + " ");
        }
        if (term == 2) {
            return;
        }
        result=a+b;
        a=b;
        b=result;
            System.out.print(result + " ");
            term--;

        fibonacciRange(a,b,term);
    }
}

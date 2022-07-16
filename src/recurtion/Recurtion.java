package recurtion;

public class Recurtion {
    private static int result=1;
    private static int res=0;
    public static void factorial(int n) {
        if (n == 0) {
            System.out.println("Factorial of is " + result);
            result=0;
        } else {
            result *= n;
            factorial(n - 1);
        }
    }

    public static void printRange(int n, int limit){
        if (n>limit){
            System.out.println(res);
            res=0;
            return;
        }
        res+=n;
        printRange(n+1,limit);
    }
    public static void printRange(int range){
        if (range==0){
            System.out.println(res);
            res=0;
            return;
        }
            res += range;
            printRange(range - 1);
    }
}

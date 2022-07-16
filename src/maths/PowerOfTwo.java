package maths;

public class PowerOfTwo {
    public static void powerofTwo(int n){

        if (n%2==1){
            System.out.println("Not power of 2");
        }
        else{
            while(n%2==0){
                n/=2;
                if (n==1){
                    System.out.println("Power of 2");
                }
                else if (n%2==1){
                    System.out.println("Not power of 2");
                }
            }
        }
    }
}

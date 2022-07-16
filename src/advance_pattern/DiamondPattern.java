package advance_pattern;

public class DiamondPattern {
    public static void Diamond(int size){
        int n=size;


        for (int i=1; i<=n; i++){
            for (int j=i; j<n; j++){
                System.out.print("   ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("  *");
            }
            for (int j=1; j<i; j++){
                System.out.print("  *");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            for (int j=i; j<n; j++){
                System.out.print("   ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("  *");
            }
            for (int j=1; j<i; j++){
                System.out.print("  *");
            }
            System.out.println();
        }
    }
}

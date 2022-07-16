package advance_pattern;

public class Rhombus {
    public static void SolidRhombus(int size){
        int n=size;
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=n; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

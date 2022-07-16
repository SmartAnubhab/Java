package advance_pattern;

public class Palindrom {
    public static void PalindromicPatter(int size){
        int n=size;

        for (int i=1; i<=n; i++){
            for (int j=i; j<n; j++){
                System.out.print("  ");
            }
            for (int j=i; j>=1; j--){
                System.out.print(j + " ");
            }
            for (int j=2; j<i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

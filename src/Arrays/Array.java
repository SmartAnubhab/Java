package Arrays;

public class Array {
    public static void reverse(int arr[]){

        System.out.print("ORIGINAL :");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("REVERSED :");
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

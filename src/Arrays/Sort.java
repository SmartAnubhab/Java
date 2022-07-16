package Arrays;

public class Sort {
    /*
    TESTED ARRAYS
        int[] arr={ 1, 2, 4, 7 };
        int[] arr2={3, 4, 6, 2};
        int[] jar={1,2,3,4,5,6,7,8,9};
     */
    public static void sortedOrNot(int[] arr){
        int counter=0;
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                System.out.println("Not sorted");
                break;
            }
            counter++;
            if (counter==arr.length-1){
                System.out.println("Sorted");
            }
        }
    }
}

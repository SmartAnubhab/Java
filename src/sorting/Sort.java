package sorting;

public class Sort {
    public static void bubbleSortAsc(int[] arr){
        //Sorting of an array in assending order
        int a,b,temp;
        for (int j=0; j<arr.length; j++) {
            for (int i = 0; i < arr.length - 1 ; i++) {
                a = arr[i];
                b = arr[i + 1];
                if (a > b) {
                    temp = b;
                    b = a;
                    a = temp;
                    arr[i] = a;
                    arr[i + 1] = b;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void bubbleSortDsc(int[] arr){
        //Sorting of an array in descending order
        int a,b,temp;
        for (int j=0; j<arr.length; j++) {
            for (int i = 0; i < arr.length - 1 ; i++) {
                a = arr[i];
                b = arr[i + 1];
                if (a < b) {
                    temp = b;
                    b = a;
                    a = temp;
                    arr[i] = a;
                    arr[i + 1] = b;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void selectionSortAsc(int[] arr){
        int temp;

        for (int i=0; i<arr.length-1; i++){
            int smallest=i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        //printing arr
        for (int k: arr){
            System.out.print(k + " ");
        }
    }
    public static void selectionSortDsc(int[] arr){
        int temp;

        for (int i=0; i<arr.length-1; i++){
            int smallest=i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[smallest]<arr[j]){
                    smallest=j;
                }
            }
            temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        //printing arr
        for (int k: arr) {
            System.out.print(k + " ");
        }
    }
    public static void insertionSortAsc(int[] arr){
        for (int i=1; i<arr.length; i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for (int a: arr){
            System.out.print(a + " ");
        }
    }
}


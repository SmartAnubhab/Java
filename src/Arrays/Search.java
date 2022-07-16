package Arrays;

public class Search {
    public static void indexOf(int x, int arr[]){
        //Liner search
        for (int i=0; i<arr.length; i++){
            if (arr[i]==x){
                System.out.println("Ïndex id : " + i);
                break;
            }
            if (i==arr.length-1)
            System.out.println("Value is Not here");
        }
    }
}

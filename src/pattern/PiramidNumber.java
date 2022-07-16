package pattern;

public class PiramidNumber {
    int size;
    public PiramidNumber(int size){
        this.size=size;
    }
    public Object Print(){
        int a = 1;
        for(int i=0; i<size; i++) {
            for (int j = i/2; j < size-(size/2) ; j++) {
                System.out.print("   ");
            }
            if (i%2==0){
                for (int j=0; j<i+1; j++){
                    System.out.print(" "+a+" ");
                }
            }
            else{
                for (int j=0; j<i+1; j++){
                    System.out.print(a+"  ");
                }
            }
            System.out.println();
            a++;
        }
        return "";
    }
}

package pattern;

public class PiramidNumberContinious {
    int size;
    public PiramidNumberContinious(int size){
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
                    a++;
                }
            }
            else{
                for (int j=0; j<i+1; j++){
                    System.out.print(a+"  ");
                    a++;
                }
            }
            System.out.println();
        }
        return "";
    }
}

package pattern;

public class PiramidAsterisk {
    int size;
    public PiramidAsterisk(int size){
        this.size=size;
    }
    public Object Print(){
        for(int i=0; i<size; i++) {
            for (int j = i/2; j < size-(size/2) ; j++) {
                System.out.print("   ");
            }
            if (i%2==0){
                for (int j=0; j<i+1; j++){
                    System.out.print(" * ");
                }
            }
            else{
                for (int j=0; j<i+1; j++){
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
        return "";
    }
}

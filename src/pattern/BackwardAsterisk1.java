package pattern;

public class BackwardAsterisk1 {
    int size;
    public BackwardAsterisk1(int size){
        this.size=size;

    }
    public Object Print(){
        for (int i=0; i<size; i++){
            for (int j=i; j<size-1; j++){
                System.out.print("  ");
            }
            for (int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return " ";
    }
}

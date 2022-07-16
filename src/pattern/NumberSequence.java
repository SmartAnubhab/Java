package pattern;

public class NumberSequence {
    int size;
    public NumberSequence(int size){
        this.size=size;
    }
    public Object Print(){
        for (int i=0; i<size; i++){
            for (int j=0; j<i+1; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }

        return "";
    }
    public Object PrintContinious(){
        int a=1;
        for (int i=0; i<size; i++){
            for (int j=0; j<i+1; j++){
                System.out.print((a)+"  ");
                a++;
            }
            System.out.println();
        }

        return "";
    }
}

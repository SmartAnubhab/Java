package pattern;
/**
 * First of all dont forget to use import statement as
 * import pattern.ForwardAstterisk1;
 *
 * use this statements in your main class to
 * make the pattern of your choice.
 * provide a integer number in parameter as size
 *
 * ForwardAstterisk1 f=new ForwardAstterisk1(5);
 *         System.out.println(f);
 */
public class ForwardAstterisk1 {
    int size;
    public ForwardAstterisk1(int size) {
        this.size=size;

    }
    public Object Print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return "" ;
    }
}

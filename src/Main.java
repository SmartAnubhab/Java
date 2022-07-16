

public class Main {
    public static void main(String[] args) {

        try{
//            int y=10/0;
            boolean b=false;


        } catch (ArithmeticException e){
            System.out.println("arithmetic exception");
        } catch (Exception e){
            System.out.println("normal exception");
        }

    }
}

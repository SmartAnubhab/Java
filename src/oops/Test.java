package oops;

public class Test {
    public int color;

   private int price;
   private boolean userAdmin=true;

   public void setPrice(int price){
       if (userAdmin) {
           this.price = price;
           System.out.println("New price is " + price);
       }
       else {
           System.out.println("You can not set the price. \n" +
                   "Only admin access.");
       }
   }
}

package arrays;

public class compareArray {
    private int[] array1=new int[10];
    private int[] array2=new int[10];

        public compareArray(int[] array1, int[] array2){
            this.array1=array1;
            this.array2=array2;


        }
        public void sameOrNot(int[] array1, int[] array2){
            this.array1=array1;
            this.array2=array2;

            if (array1.length==array2.length) {
                for (int i = 0; i < array1.length; i++) {
                    if (array1 != array2)
                        System.out.println();
                }
            }
            else {
                System.out.println("Tow arrays are not same");
            }
        }


}

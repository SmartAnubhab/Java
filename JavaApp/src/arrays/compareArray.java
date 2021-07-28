package arrays;

public class compareArray {

    /**
     * To implement this code first import the code
     * in the main class using
     * import arrays.compareArray;
     * Then use this code
     *
     * int[] firstArray={8,2,5,0,8,9,1,4,9,9};
     *         int[] secondArray={9,9,0,3,0,1,4,7,8,8};
     *         int[] thirdArray={8,2,5,0,8,9,1,4,9,9};
     *         int[] fourthArray={1,2,3,4,5};
     *
     *         compareArray com=new compareArray(firstArray, secondArray);
     *         compareArray com2=new compareArray(firstArray, thirdArray);
     *         compareArray com3=new compareArray(firstArray,fourthArray);
     *         com.sameOrNot();
     *         com2.sameOrNot();
     *         com3.sameOrNot();
     */


    private int[] array1=new int[10];
    private int[] array2=new int[10];

        public compareArray(int[] array1, int[] array2){
            this.array1=array1;
            this.array2=array2;


        }
        public void sameOrNot(){

            if (array1.length==array2.length) {
                for (int i = 0; i < array1.length; i++) {
                    if (array1[i] != array2[i]) {
                        System.out.println("Tow arrays are not same");
                        break;
                    }
                    else if (array1.length-1==i) {
                        System.out.println("Tow arrays are same");
                    }
                }
            }
            else {
                System.out.println("Tow arrays are not same");
            }
        }


}

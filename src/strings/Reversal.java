package strings;

public class Reversal {
    /**
     * Following two are overloaded methods
     * that means you can use String and StringBuilder both as
     * parameters
     * Time complexity of this follwing code will be "O(n)".
     */
    public static void stringReverse(String sbs){
        StringBuilder sb=new StringBuilder(sbs);
        for (int i=0; i<sb.length()/2; i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
    public static void stringReverse(StringBuilder sb){
        for (int i=0; i<sb.length()/2; i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
    public static void reversal(StringBuilder st){
        //Reversal of a String


        for (int i=0; i<st.length()/2; i++){
            char first, last;
            first = st.charAt(i);
            last = st.charAt(st.length()-1-i);

            st.setCharAt(i, last);
            st.setCharAt(st.length()-1-i, first);
        }
        System.out.println(st);
    }
}

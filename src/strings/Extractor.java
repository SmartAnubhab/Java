package strings;

public class Extractor {
    public static void domain(String email){
        System.out.print("EMAIL : ");
        for (int i=0; i<email.length(); i++){
            if (email.charAt(i)=='@'){
                for (int j=i+1; j<email.length(); j++)
                    System.out.print(email.charAt(j));
            }
        }
        System.out.println();
    }
    public static void userName(String email){
        System.out.print("DOMAIN : ");
        for (int i=0; i<email.length(); i++){
            if (email.charAt(i)=='@'){
                break;
            }
            else
                System.out.print(email.charAt(i));
        }
        System.out.println();
    }
}

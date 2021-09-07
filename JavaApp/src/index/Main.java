package index;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello world");

        Human human1=new Human("Anubhab Mondal",27);
        Human human2=new Human("Ankita", 15);

        human1.talk();
        human2.talk();

    }
}

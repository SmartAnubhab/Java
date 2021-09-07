package index;

public class Human {
    String name;
    int age;

    Human(String name, int age){
        this.name=name;
        this.age=age;
    }

    void talk(){
        System.out.println("Hello my name is " + name +
                " and I am " + age + " years old.");
    }
}

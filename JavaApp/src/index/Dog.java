package index;

public class Dog extends Animal implements Sleep{
    void bark(){
        System.out.println("dog is barking ");
    }

    @Override
    public void sleep() {
        
    }
}

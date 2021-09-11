package index;

public class Main{
    public static void main(String[] args){

        Animal animal=new Animal();
        animal.eat();
        Dog dog=new Dog();
        dog.bark();
        dog.talk();

        Fish fish=new Fish();
        fish.swim();
        fish.talk();
        fish.eat();
        dog.sleep();

    }
}

package oops;

public class TestChild extends Test{
    public TestChild(int count){
//        super(count);
        System.out.println("child class with parameter");
    }

    public TestChild() {
        System.out.println("child class with no parameter");
    }

    public void testing(){
        System.out.println("I am testing something");
    }
}

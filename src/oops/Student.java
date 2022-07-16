package oops;

import java.util.Objects;

public class Student {
    private int roll;
    private int std;
    private String name;
    private static int newRoll=1;

    @Override
    public String toString() {
        return "\nStudent{" +
                "std=" + std +
                ", name='" + name + '\'' +
                '}' ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStd() == student.getStd();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStd());
    }

    public Student(Student student){
        this.setName(student.name);
        this.setStd(student.std);
    }
    public Student(int std, String name){
        setName(name);
        setStd(std);
        roll=newRoll;
        setRoll(this.roll);
        newRoll++;
    }

    private void setRoll(int roll){
        this.roll=roll;
    }
    private int getRoll(){
        return roll;
    }

    private void setStd(int std) {
            this.std = std;
    }

    private int getStd() {
        return std;
    }
    private void setName(String name){
        this.name=name;
    }
    private String getName(){
        return name;
    }

    public void printStudent(){
        System.out.println("name : " + getName() +
                            " std : " + getStd() +
                            " roll : " + getRoll());
    }
    public void printS(){
        System.out.printf("%-15s%03d%n",getName(),getStd());
    }

}

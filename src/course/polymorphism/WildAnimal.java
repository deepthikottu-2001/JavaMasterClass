package course.polymorphism;

public class WildAnimal extends Animal{

    @Override
    public void eat() {
        System.out.println("I will eat Meat");

    }

    @Override
    public void run() {
        System.out.println("I will running at" + getMinSpeed());

    }
}

package course.polymorphism;

public class Elephant extends DomesticAnimal{

    @Override
    public void eat() {
        System.out.println("I will eat Fruits");
    }

    public static void main(String[] args){
        Elephant e = new Elephant();
        e.setMinSpeed("20 km/h");
        e.eat();
        e.run();
    }
}

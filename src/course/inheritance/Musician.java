package course.inheritance;

public class Musician extends Human{

    Keyboard myKeyboard = new Keyboard();
    public void playKeyBoard(){
        System.out.println(name + " is playing Keyboard now");
    }

    public void speak(){
        System.out.println(name + " will speak calm!!..");
    }
    public static void main(String[] args){
        Musician a = new Musician();
        a.name = "Raj";
        a.age = 27;
        a.gender = "Male";

        a.walk();
        a.speak();
        a.playKeyBoard();
        a.myKeyboard.playSound();
    }
}


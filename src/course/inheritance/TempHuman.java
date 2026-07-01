package course.inheritance;

public class TempHuman extends Human {

    public static void letsWalk(Human h){
        h.walk();
    }
    public static void main(String[] args){
        Artists a = new Artists();
        a.name = "Deepti";

        Musician b = new Musician();
        b.name = "Raj";

        letsWalk(a);
        letsWalk(b);
    }
}


package course.mypackageA;
import course.mypackageB.Person;

public class ClassObjSample {
    public static void main(String[] args) {
        Person alex = new Person();
        alex.name = "Alex";
        alex.age= 55;
        alex.gender= "Male";
        alex.sleep();

        Person mia = new Person();
        mia.name="Mia";
        mia.age=20;
        mia.gender="Female";
        mia.sleep();

        Person vihan =new Person();
        vihan.name="Vihan";
        vihan.age=8;
        vihan.gender="Male";
        vihan.sleep();
    }
}


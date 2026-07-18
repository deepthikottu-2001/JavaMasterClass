package course.mypackageA;
import course.mypackageB.Person;

public class ClassObjSample {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 25, "Male");
        alex.name = "Alex";
        alex.age= 55;
        alex.gender= "Male";
        alex.sleep();

        Person mia = new Person("Alex", 25, "Male");
        mia.name="Mia";
        mia.age=20;
        mia.gender="Female";
        mia.sleep();

        Person vihan =new Person("Alex", 25, "Male");
        vihan.name="Vihan";
        vihan.age=8;
        vihan.gender="Male";
        vihan.sleep();
    }
}


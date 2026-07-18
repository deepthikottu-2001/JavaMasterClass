package course.variablepkg;

import course.mypackageB.Person;

public class ArrayTest {
    public static void main(String[] args){
        Person[] users = new Person[3];
        Person alex = new Person("Alex", 25, "Male");
        alex.name = "Alex";
        alex.age= 55;
        alex.gender= "Male";


        Person mia = new Person("Alex", 25, "Male");
        mia.name="Mia";
        mia.age=20;
        mia.gender="Female";


        Person vihan =new Person("Alex", 25, "Male");
        vihan.name="Vihan";
        vihan.age=8;
        vihan.gender="Male";

        users[0] = alex;
        users[1] = mia;
        users[2] = vihan;

        System.out.println(users[0].age);

        }

    }


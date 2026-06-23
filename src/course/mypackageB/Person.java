package course.mypackageB;

public class Person {

        public String name;
        public int age;
        public String gender;

        public void sleep(){
            if(age<10){
                System.out.println(name + " will sleep more than 12hrs in a day");
            } else if (age<=10) {
                System.out.println(name + " will sleep less than 10hrs in a day");

            }else {
                System.out.println(name + " will sleep average 10hrs in a day");
            }
        }
    }


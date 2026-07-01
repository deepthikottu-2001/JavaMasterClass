package course.inheritance;

public class Artists extends Human{

    public void preparePainting(){
        System.out.println(name + " is prepared");
    }

    public static void main(String[] args){
        Artists a = new Artists();
        a.name = "Deepti";
        a.age = 25;
        a.gender = "Female";

        a.preparePainting();
        a.walk();
    }

}

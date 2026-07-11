package course.stringpkg;

public class StringSample {
    public static void main(String[] args){
        String s1 = new String("Welcome");
        String s2 = new String("Welcome");

        if(s1 == s2){
            System.out.println("Both refrences are pointing to same object");

        }else{
            System.out.println("Both references are pointing to different object");
        }
    }
}

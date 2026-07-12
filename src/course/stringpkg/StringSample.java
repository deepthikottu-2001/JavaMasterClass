package course.stringpkg;

public class StringSample {
    public static void main(String[] args) {
        //StringBuffer s1 = new StringBuffer("Welcome Java");
        StringBuilder s1 = new StringBuilder("Welcome Java");
        //s1.append("!!!"); --> append Method
        //s1.charAt(1);
        //s1.delete(1,3);
        s1.insert(1,"aa");
        System.out.println(s1);
    }

    }



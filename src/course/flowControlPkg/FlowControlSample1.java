package course.flowControlPkg;

public class FlowControlSample1 {
    public static void main(String[] args){
        if(false){
            System.out.println("code executed inside IF block");
        } else if (true) {

            System.out.println("code executed inside 1st Else If  block");
        }
        else if (true) {

            System.out.println("code executed inside 2nd Else If  block");

        }
        else{
            System.out.println("code executed inside Else block");
        }


    }
}


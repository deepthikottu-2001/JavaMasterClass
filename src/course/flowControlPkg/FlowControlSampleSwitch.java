package course.flowControlPkg;

public class FlowControlSampleSwitch {
    public static void main(String[] args){
        int guess =2;
        switch(guess){
            case 1: {
                System.out.println("Guess is 1");
                break;
            }
            case 2: {
                System.out.println("Guess is 2");
                break;
            }
            case 3: {
                System.out.println("Guess is 3");
                break;
            }
            default: {
                System.out.println("Guess must be greater than 1 and less than 2");
                break;
            }
        }
    }
}

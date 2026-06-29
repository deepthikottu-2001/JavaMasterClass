package course.flowControlPkg;

public class FlowControlSampleEnhancedFor {
    public static void main(String[] args){
        int[] intArray = {2,4,6,1,3};
        for(int i: intArray){
           /* if(i == 4){
                System.out.println("I found it");
                break;/*

            */
            if(i==4){
                continue;
            }
            System.out.println(i);

        }
    }
}

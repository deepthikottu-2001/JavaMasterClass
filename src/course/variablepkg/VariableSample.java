package course.variablepkg;

public class VariableSample {
    public void operatorsTest(){
        int count = 10;
        int extraCount = 2;
        int totalCount = count;
        if(extraCount >= 2)
        {
            totalCount = count + extraCount;
        }
        System.out.print("Total Count is :: " + totalCount);

    }


    public static void main(String[] args){
        VariableSample obj = new VariableSample();
        obj.operatorsTest();

    }
}

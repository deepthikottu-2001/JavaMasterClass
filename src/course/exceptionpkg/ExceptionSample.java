package course.exceptionpkg;

public class ExceptionSample {
    public static void main(String[] args){
        int userInput = 0;
        try{
             userInput = Integer.parseInt("abc");
            String[] fruits = {"Bananas","Watermelon","Apples","Oranges"};
            System.out.println("User Picked "+ fruits[userInput-1]);
        }catch(NumberFormatException e){
            System.out.println("Invalid Number. You have to give only numbers. ");

        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Give numbers between 1 to 4");
        }catch(Exception e){

            System.out.println("Something went wrong");
        }



    }

}

package course.exceptionpkg;

public class ExceptionSample {
    public static void main(String[] args){

        try{
            doSomething();

        }catch(NumberFormatException e){
            System.out.println("Invalid Number. You have to give only numbers. ");

        }catch(ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException("Give numbere between 1 to 4");
        }catch(Exception e){
            System.out.println("Something went wrong");
        }

}
      public static void doSomething() throws ArrayIndexOutOfBoundsException, NumberFormatException{
          int userInput = 0;
          userInput = Integer.parseInt("8");
          String[] fruits = {"Bananas","Watermelon","Apples","Oranges"};
          System.out.println("User Picked "+ fruits[userInput-1]);

      }

}

public class BasicJavaPrograms {
   public static void main(String[] args) {
      System.out.println("Java - Basic Programs: ");
      int numberOne, numberTwo;
      numberOne = 10;
      numberTwo = 20;
      System.out.println("Before Swapping\nx = " + numberOne + "\ny = " + numberTwo);
      numberOne = numberOne + numberTwo; // sum of two values
      numberTwo = numberOne - numberTwo; // subtract sum from second to get swap
      numberOne = numberOne - numberTwo;
      System.out.println("After Swapping without temp variable\nx = " + numberOne + "\ny = " + numberTwo);
   }
}

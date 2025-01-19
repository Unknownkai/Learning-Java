import java.util.Scanner;
  class Assignment1A {
    public static void main(String[] args) {
      Scanner myScanner = new Scanner (System.in);

      System.out.println(" x + (y / z) * w = ?");
      System.out.println("Enter the first term: ");

      float firstTerm = myScanner.nextFloat();
      
      System.out.println( firstTerm + " + (y / z) * w = ?");
      System.out.println("Enter the second term: ");
      
      float secondTerm = myScanner.nextFloat();

      System.out.println( firstTerm + " + ("  + secondTerm + " / z) * w = ?");
      System.out.println("Enter the third term: ");

      float thirdTerm = myScanner.nextFloat();

      System.out.println( firstTerm + " + (" + secondTerm + "/" + thirdTerm + ") * w = ?");
      System.out.println("Enter the fourth term: ");

      float fourthTerm = myScanner.nextFloat();

      float answer = firstTerm + secondTerm / thirdTerm * fourthTerm; 

      System.out.println(firstTerm + "+ (" + secondTerm + "/" + thirdTerm + ") * " + fourthTerm + " = " + answer );

   }
}
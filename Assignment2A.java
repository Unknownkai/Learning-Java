import java.util.Scanner;
class Assignment2A {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);

    System.out.println("Enter a number you want to find a mutliple of: ");
    int oneNumb = myScan.nextInt();
    //first number

    System.out.println("Enter a second number: ");
    int secNumb = myScan.nextInt();
    // sec = second number

    int Mult = secNumb % oneNumb;
    int Final = secNumb - Mult;
    
    System.out.println("Calculating... ");

    System.out.println("The nearest mutliple of " + oneNumb + " from " + secNumb + " is " + Final);



    

  


  }
}
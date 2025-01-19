import java.util.Scanner;
class Assignment4A {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.println("[Times Table Generator]");
 
    System.out.print("Enter your Start number: ");
    int Start = myScan.nextInt();
    while (Start < 1){
      System.out.println("Input must be positive! Try again");
      System.out.print("Enter your Start number: ");
      Start = myScan.nextInt();
    }
    
    System.out.print("Enter the limit you want to multiply to: ");
    int Limit = myScan.nextInt();
    while (Limit < 1){
      System.out.println("Input must be positive! Try again");
      System.out.print("Enter the limit you want to multiply to: ");
      Limit = myScan.nextInt();
    }
    for (int i = 1; i<=Limit; i++ ){

        int product = (Start*i);
        System.out.println(Start+ " * " +i+ " = " +product);
      }
    
    }
}
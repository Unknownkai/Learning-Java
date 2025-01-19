import java.util.Scanner;
class Lab7C {
  public static void main(String[] args) {
     Scanner myScan= new Scanner(System.in);
    System.out.print("Please enter a value for the size: ");
    int size = myScan.nextInt();

    System.out.println("This is the requested " +size+"x"+size+ " right-triangle:");

    for(int row=1; row<=size; row++){
      for(int space=1; space <= (size-row); space++){
        System.out.print(" ");}
        for(int star=1; star<=row; star++){
          System.out.print("*");
        }
      System.out.println(" ");
    }
    
  }
}
import java.util.Scanner;
class Lab7A {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.print("Please enter a value for the size: ");
    int size = myScan.nextInt();

    System.out.println("This is the requested " +size+ "x" +size+ " box:");
    
    for (int i=1;i<=size; i++ ){
      for(int j=1; j<=size; j++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
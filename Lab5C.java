import java.util.Scanner;
class Lab5C {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.print("Enter X: ");
    int x = myScan.nextInt();
    System.out.print("Enter Y: ");
    int y = myScan.nextInt();

    if (x == 0 && y == 0){
      System.out.println("This point is the origin.");
    }
    if (x == 0 && y != 0) {
      System.out.println("This point is on the Y axis.");
    }
    if (x != 0 && y == 0) {
      System.out.println("This point is on the X axis.");
    }
    if (x > 0 && y > 0) {
      System.out.println("This point is in the first quadrant.");
    }
    if (x < 0 && y > 0) {
      System.out.println("This point is in the second quadrant.");
    }
    if (x < 0 && y < 0) {
      System.out.println("This point is in the third quadrant.");
    }
    if (x > 0 && y < 0) {
      System.out.println("This point is in the fourth quadrant.");
    }
  }
}
import java.util.Scanner;
class Assignment2B {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);

    System.out.println("[Pentagon Calculator]");
    System.out.println("Enter the length of one side: ");
    int Side = myScan.nextInt();

     double expo = (Side*Side);
     double Squared = 5 * (5+Math.sqrt(20) );
     double Total = .25 * Math.sqrt(Squared) * expo;

     int perim = Side * 5;
    
     System.out.println("Pentagon Perimeter = " + perim);
     System.out.println("Pentagon Area = "+ Total);

    System.out.println("[Hexagon Calculator]");
    System.out.println("Enter the length of one side: ");
    int Side2 = myScan.nextInt();

      double expo2 = (Side2 * Side2);
      double Total2 = Math.sqrt(27) / 2 * expo2;
      int perim2 = Side2 * 6;
    
     System.out.println("Hexagon Perimeter = " + perim2);
     System.out.println("Hexagon Area = " + Total2);
    









  }
}
import java.util.Scanner;
class Lab3A {
  public static void main(String[] args) {
    Scanner newScan = new Scanner(System.in);

     System.out.println("Amount owed: ");
     float amountOwed = newScan.nextFloat();

     System.out.println("APR: ");
     float APR = newScan.nextFloat();

     float monthlyPercentagerate= APR / 12;
     System.out.println("Monthly Percentage Rate: "+ monthlyPercentagerate);

      float minimumPayment = (amountOwed * APR / 12) * 0.01f;
      System.out.println("Minimum Payment: "+ minimumPayment);


     /*System.out.println("What is the currect balance on your credit card? ");
     float creditCard = newScan.nextFloat();

     System.out.println("What is the Annual percentage rate (APR) of the card? ");
     float Apr = newScan.nextFloat();

     float monthlyPercentagerate= Apr / 12;

     System.out.println("Amount owed: $" + creditCard);
     System.out.println("APR: " + Apr);

     System.out.println("Monthly percentage rate: "+ monthlyPercentagerate);
     float minimumPayment = (creditCard * Apr / 12) * 0.01f;

     System.out.println("minimum payment " + minimumPayment);
    */

  }
}
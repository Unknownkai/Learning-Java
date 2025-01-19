import java.util.Scanner;
class Assignment3A {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.println("[Scrappy's Bucket List Rewards]");
    System.out.print("How many events have you attended? ");
    float attended = myScan.nextInt();
    float percentage = (attended / 63) * 100;
    int intPercentage = (int)percentage;

   if (attended ==0){
      System.out.println("Check out events at https://studentaffairs.kennesaw.edu/scrappysbucketlist/!");
    }

    if (percentage !=0){
     System.out.println("You've been to "+intPercentage+ "% of all SBL events!");
    
      if (percentage >=10){
      System.out.println("You've earned a Drawstring Bag!");
      }
      if (percentage >=25){
      System.out.println("You've earned a Hat!");
      }
      if (percentage >=50){
      System.out.println("You've earned a T-Shirt!");
      }
      if (percentage >=75){
      System.out.println("You've earned a Glass Water Bottle!");
      }
      if (percentage >=100){
      System.out.println("You've earned a Hoodie!");
      System.out.print("Are you graduating? ");
     String graduating = myScan.next();

      if ((graduating.equals("Yes") || (graduating.equals("yes")))) {
        System.out.println("You've earned a Challenge Coin and special Graduation Cords");
      }
      if ((graduating.equals("No") || graduating.equals("no"))) {
        System.out.println("There's a special reward when you graduate!");
      }
      }
  }
  }
}
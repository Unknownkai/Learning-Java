import java.util.Scanner;
class Assignment2C {
  public static void main(String[] args) {
    Scanner myScann = new Scanner(System.in);
  
     System.out.println("Enter a number of miles: ");
     float Miles = myScann.nextFloat();

     System.out.println("\nYou: I walked " + Miles + " miles today #fitnessgoals");

     float REFRIGERATOR = 0.00105745F;
     float CANDY = 0.0000848327F;

     float  MtoR = Miles / REFRIGERATOR;
     float MtoC = Miles / CANDY;

     int MilestoR = (int) MtoR;
     int MilestoC = (int) MtoC;

     System.out.println("Useless Converison Bot: Wow, " +Miles+ " miles is " +MilestoR+ " refrigerators long!");

     

     System.out.println("Useless Converison Bot: "+Miles+ " miles is also  " + MilestoC + " candy bars long!");

     System.out.println("Useless Conversion Bot: That's a lot.");





     








  }
}
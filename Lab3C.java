import java.util.Scanner;
class Lab3C {
  public static void main(String[] args) {
    Scanner newScan = new Scanner(System.in);

    System.out.println("Enter the number of quarters: ");
    int Quarters = newScan.nextInt();
    System.out.println("Enter the number of dimes: ");
    int Dimes = newScan.nextInt();
    System.out.println("Enter the number of nickels: ");
    int Nickels = newScan.nextInt();
    System.out.println("Enter the number of Pennies: ");
    int Pennies = newScan.nextInt();

    System.out.println("You entered "+Quarters+ " quarters.");
    System.out.println("You entered "+Dimes+ " dimes.");
    System.out.println("You entered "+Nickels+ " nickels.");
    System.out.println("You entered "+Pennies+ " pennies.");

    float quarterValues = Quarters * 25;
    float dimeValues = Dimes * 10;
    float nickelValues = Nickels * 5;
    float penniesValues = Pennies * 1;

    float Total = quarterValues + dimeValues + nickelValues + penniesValues;

    float Tcents = Total % 100 ;
    float Tdollars = Total / 100;

    int Cents = (int) Tcents;
    int Dollars = (int) Tdollars;

    System.out.println(" Your Total is "+Dollars+" dollars and " +Cents+" cents.");

    

    








  

   



    
  }
}
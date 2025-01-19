import java.util.Scanner;
class Lab4C {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.println("Welcome!");
    System.out.println("Please input a number: ");
    float Number = myScan.nextFloat();

    System.out.println("What would you like to do to this number: ");
    System.out.println(" 0- get the additive inverse of the number");
    System.out.println(" 1- get the reciprocal of the number");
    System.out.println(" 2- Square the number");
    System.out.println(" 3- Cube the number");
    System.out.println(" 4- Exit the program");

    int inputNumber = myScan.nextInt();
     
    switch (inputNumber) {
    case 0:
    float  additiveInverse = Number * -1;
    System.out.println("The additive inverse of "+ Number+ " is " +additiveInverse);
    break;
    case 1:
    float reciprocal = 1/Number;
    System.out.println("The reciprocal of " +Number+ " is " +reciprocal);
    break;
    case 2:
    float Square = Number * Number;
    System.out.println("The square of " +Number+ " is " +Square);
    break;
    case 3:
    float Cube = Number * Number * Number;
    System.out.println("The cube of " +Number+ " is " +Cube);
    break;
    case 4:
    System.out.println("Thank you, goodbye!");
    break;
    default:
    System.out.println("Invaild input, please try again!");
    }


    

    


     


  }
}
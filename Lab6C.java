import java.util.Scanner;
class Lab6C {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.println("Welcome!");
    System.out.println("You have $1000 in your account.");

    int begin = 1000;
    char answer;

do{
    System.out.println("Menu");
      System.out.println("0 - Make a deposit");
      System.out.println("1 - Make a withdrawl");
      System.out.println("2 - Display account value ");

      System.out.print("Please make a selection: ");
      int selection = myScan.nextInt();

      switch (selection){
        case 0:
        System.out.print("How much would you like to deposit? : ");
        int deposit = myScan.nextInt();
        begin = (begin + deposit);
        System.out.println("Your currect balance is $" +begin);
        System.out.print("Would you like to return to the main menu (Y/N)? : ");
        answer = myScan.next().charAt(0);

        break;
        case 1:
        System.out.print("How much would you like to withdrawl? : ");
        int withdrawl = myScan.nextInt();
        begin = (begin - withdrawl);
        System.out.println("Your currect balance is $" +begin);
        System.out.print("Would you like to return to the main menu (Y/N)? : ");
        answer = myScan.next().charAt(0);

        break;
        case 2:
        System.out.println("Your currect balance is $" +begin);
        System.out.print("Would you like to return to the main menu (Y/N)? : ");
        answer = myScan.next().charAt(0);

        break;
        default:
        System.out.println("Invaild entry, please try again.");
        System.out.print("Would you like to return to the main menu (Y/N)? : ");
        answer = myScan.next().charAt(0);

      }
  }while (answer == 'Y');

  if (answer == 'N');{
  System.out.println("Thanks you for banking with us!");
  }
  }
}
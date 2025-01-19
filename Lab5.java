import java.util.Scanner;
class Lab5 {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.print("Do you have a driving permit (Y/N)? ");
    char answer = myScan.next().charAt(0);
    
    if ((answer == 'N') || (answer == 'n')) {
      System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
    }
    if ((answer == 'Y') || (answer == 'y')) {
      System.out.print("Do you have a commerical driving license (Y/N)? ");
    char secAnswer = myScan.next().charAt(0);
    if ((secAnswer == 'N') || (secAnswer == 'n')) {
      System.out.println("Commerical driving license is a prerequisite to purchase a vehicle!");
    }
    if ((secAnswer == 'Y') || (secAnswer == 'y')) {
      System.out.println("Congratulations! You can purchase a vehicle, Let's start talking options!");
    }
    }
  }
}
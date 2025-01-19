import java.util.Scanner;  
  class Assignment1C {
    public static void main(String[] args) {
    Scanner myScanner = new Scanner (System.in);

    System.out.println("Enter the first letter of your first name: ");
    String firstName = myScanner.next();

    System.out.println("Enter your last name: ");
    String lastName = myScanner.next();

    System.out.println("Enter a valid whole number: ");
    int wholeNumber = myScanner.nextInt();

    String netId = firstName + lastName + wholeNumber;

    System.out.println("Your KSU NetID is " + netId + " You can log into KSU computers with this NetID as your username and your email password as the password");
    System.out.println("Your email address is " + netId + "@student.kennesaw.edu.");
 
  
  }
}
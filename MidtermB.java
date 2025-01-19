import java.util.Scanner;
class MidtermB {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);

    int correct=0;
     System.out.println("What three progamming language are taugh in CSE 1321L? ");
    System.out.println("A - C#");
    System.out.println("B - Java");
    System.out.println("C - C++");
    System.out.println("D - python");

    
    System.out.print("Please enter an answer ");
     char answer = myScan.nextChar();

    switch (answer) {
      case 'A':
        System.out.println("You are correct!");
        break;

      case 'B':
        System.out.println("You are correct!");
        break;

      case 'C':
        System.out.println("You are correct!");

        break;

      case 'D': 
        System.out.println("You are incorrect!");
        break;

      default:
        System.out.println("You are incorrect!");
  }
     if (answer == 'A' || answer == 'B' || answer == 'C'){
        correct++;
      } 
    System.out.println("What is the name of he bi-annual student showcase for CCSE? ");
    System.out.println("A - C-Day");
    System.out.println("B - A-Day");
    System.out.println("C - D-Day");
    System.out.println("D - T-Day");

    System.out.print("Please enter an answer ");
     char answertwo = myScan.next();

    switch (answertwo) {
      case 'A':
        System.out.println("You are correct!");
        break;

      case 'B':
        System.out.println("You are incorrect!");
        break;

      case 'C':
        System.out.println("You are incorrect!");

        break;

      case 'D': 
        System.out.println("You are incorrect!");
        break;

      default:
        System.out.println("You are incorrect!");
        
  }
   if (answertwo == 'A'){
        correct++;
      }
    System.out.println("Your Final score is " +correct "/2");
    

    
  }
}
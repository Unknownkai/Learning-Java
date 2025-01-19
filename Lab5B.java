import java.util.Scanner;
class Lab5B {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int integer = myScan.nextInt();
    int div = 0;
    if (integer % 2 == 0){
      div = 1;
    }
      else if (integer % 3 == 0){
        div = 2;
      }
      else if (integer % 5 == 0){
          div = 3;
        }
        else {
          div = 4;
        }

      
    
    switch (div) {
      case 1:
      //int dividetwo = integer % 2;
      System.out.println("This number is divisible by 2");
      break;
      case 2: 
      //int dividethree = integer % 3;
      System.out.println("This number is divisble by 3");
      break;
      case 3:
      //int divideFive = integer % 5;      
      System.out.println("This number is divisble by 5");
      break;
      case 4:
      System.out.println("This number is undetermined");

    }
  }
}
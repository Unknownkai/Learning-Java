import java.util.Scanner;
class Lab4{
  public static void main(String[] args) {
  Scanner myScan = new Scanner(System.in);
  
  System.out.println("Enter the score of your exam: ");
  float testScore = myScan.nextFloat();

   if (testScore >= 97.5f){
    System.out.println("Letter grade is: A+");
   }
    else if (testScore>=95){
    System.out.println("Letter grade is: A");
    }
    else if (testScore>=92){
    System.out.println("Letter grade is: A-");
    }
    else if (testScore>=89){
    System.out.println("Letter grade is: B+");
    }
    else if (testScore>=86){
    System.out.println("Letter grade is: B");
    }
    else if (testScore>=83){
    System.out.println("Letter grade is: B-");
    }
    else if (testScore>=80){           
     System.out.println("Letter grade is: C+");
    }
    else if (testScore>=77){
    System.out.println("Letter grade is: C");
    }
    else if (testScore>=74){
    System.out.println("Letter grade is: C-");
    }
    else if (testScore>=71){
    System.out.println("Letter grade is: D+");
    }
    else if (testScore>=68){
    System.out.println("Letter grade is: D");
    }
    else if (testScore>=65){
    System.out.println("Letter grade is: D-");
    }
    else {
    System.out.println("Letter grade is: F");
    }

  } 
}
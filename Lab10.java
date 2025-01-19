import java.util.Scanner;
class Lab10 {
public static double average (int x, int y){
    return((x+y)/2);
    }
  public static int highest(int num1, int num2){
    if(num1>num2){
      return num1;
    }
    else {
      return num2;
    }
  }
  public static int lowest(int num1, int num2){
    if(num1<num2){
      return num1;
    }
    else {
      return num2;
    }
  }
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);

    
    int num1, num2;
    double result1, result2;
    
    num1 = 5;
    num2 = 7;

    System.out.print("Enter number 1: ");
    int answ1 = myScan.nextInt();
    System.out.print("Enter number 2: ");
    int answ2 = myScan.nextInt();

     result1 = average(answ1, answ2);
    
     System.out.println("Max is "+highest(answ1,answ2));
    System.out.println("Min is " +lowest(answ1,answ2));
    System.out.println("Average is " +result1);
    
  }
}
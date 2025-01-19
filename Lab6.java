import java.util.Scanner;
class Lab6 {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.println("Please enter 10 numbers and this program will display the largest.");
    int i;
    int largest = 0;
    for (i = 1; i <=10; i++){
      System.out.print("Pleasse enter number "+i+": ");
      int numb = myScan.nextInt();

      if (numb >= largest){
        largest = numb;
      }
    }
      System.out.println("The largest number was " +largest);
      
    
  }
}
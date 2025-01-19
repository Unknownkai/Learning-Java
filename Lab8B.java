import java.util.Scanner;
class Lab8B {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    
    
    System.out.print("Please enter the number of rows: ");
    int rows = myScan.nextInt();
    System.out.print("Please enter the number of columns: ");
    int columns = myScan.nextInt();
    
    int counter = 1;
    int[][] myArray = new int [rows][columns];
    
    int spaces = rows * columns;
    
    System.out.println("I have " +rows+ " rows and " +columns+ " columns. I need to fill-up " +spaces+ " spaces.");

    System.out.println("The " +rows+ "*" +columns+ " array:");
    for (int i=0; i<rows; i++){
      for (int j=0; j<columns; j++){
        myArray[i][j]=counter;
        System.out.print(myArray[i][j]+ "|");
        counter++;
      }
      System.out.println();
    }
   
    
  }
}
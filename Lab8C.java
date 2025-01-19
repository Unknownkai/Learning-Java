import java.util.Scanner;
class Lab8C {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    
     System.out.print("Please enter the number of rows: ");
    int rows = myScan.nextInt();
    System.out.print("Please enter the number of columns: ");
    int columns = myScan.nextInt();
    
    int counters = 1;
    int[][] myArray = new int [rows][columns];

    int spaces = rows * columns;
    
    System.out.println("I have " +rows+ " rows and " +columns+ " columns. I need to fill-up " +spaces+  " spaces.");
    

    System.out.println("The " +rows+ "*" +columns+ " array:");
    for (int i=0; i<rows; i++){
      for (int j=0; j<columns; j++){
        myArray[i][j]=counters;
        System.out.print(myArray[i][j]+ "|");
        counters++;
      }
      System.out.println();
    }

    System.out.println("The " +rows+ "*" +columns+ " array flattened into a " +spaces+ " cell 1-D array: ");

    int[] myArray2 = new int [spaces];
    int counter2 = 1;
      
    for(int i=0;i<spaces; i++){
    myArray2[i] = counter2;
        System.out.print(myArray2[i]+ "|");
        counter2++;
    

      
    }
    

    
  }
}
import java.util.Scanner;
class Lab8 {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
     int[] myArray = new int [5];
     int[] myArray2 = new int [5]; 

    System.out.println("Please enter 5 integers for the first array: ");
    
    System.out.print("Integer 1: ");
    myArray[0] = myScan.nextInt();
    
    System.out.print("Integer 2: ");
     myArray[1]= myScan.nextInt();
    
    System.out.print("Integer 3: ");
     myArray[2] = myScan.nextInt();
    
    System.out.print("Integer 4: ");
    myArray[3] = myScan.nextInt();
    
    System.out.print("Integer 5: ");
     myArray[4] = myScan.nextInt();


     System.out.println("Please enter 5 integers for the second array: ");
    
    System.out.print("Integer 1: ");
    myArray2[0] = myScan.nextInt();
    
    System.out.print("Integer 2: ");
    myArray2[1] = myScan.nextInt();
    
    System.out.print("Integer 3: ");
    myArray2[2] = myScan.nextInt();
    
    System.out.print("Integer 4: ");
    myArray2[3] = myScan.nextInt();
    
    System.out.print("Integer 5: ");
    myArray2[4] = myScan.nextInt();

    int sum0 = myArray[0] + myArray2[0];
    int sum1 = myArray[1] + myArray2[1];
    int sum2 = myArray[2] + myArray2[2];
    int sum3 = myArray[3] + myArray2[3];
    int sum4 = myArray[4] + myArray2[4];

    System.out.println("The resulting sums "+sum0+ "|" +sum1+ "|" +sum2+ "|" +sum3+ "|" +sum4+ "|");

    

    
    
  }
}
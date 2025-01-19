import java.util.Scanner;
class Lab9A {  
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    int[] myArray = new int [10];
    
    System.out.println("Please enter 10 numbers: ");
    
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

     System.out.print("Integer 6: ");
     myArray[5] = myScan.nextInt();

     System.out.print("Integer 7: ");
     myArray[6] = myScan.nextInt();

     System.out.print("Integer 8: ");
     myArray[7] = myScan.nextInt();

     System.out.print("Integer 9: ");
     myArray[8] = myScan.nextInt();

     System.out.print("Integer 10: ");
     myArray[9] = myScan.nextInt();

    System.out.print("What do you want the target to be? ");
    int target = myScan.nextInt();

    int find = 0;
    for (int i=0; i<myArray.length; i++){
      if (myArray[i]==target){
        find++;
      }
      
     
      }
     if (find != 0 ){
        System.out.println("The target is in the set.");
        }
        else{
          System.out.println("The target is not in the set.");
       }
  }
}
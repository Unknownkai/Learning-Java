import java.util.Scanner;
class Lab9B {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    int[] myArray = new int [11];
    
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

    System.out.print("Integer 11: ");
     myArray[10] = myScan.nextInt();

    System.out.print("What do you want the target to be? ");
    int target = myScan.nextInt();

     int find = 0;
    for (int i=0; i<myArray.length; i++){
      if (myArray[i]==target){
        find++;
      }


      for (int q=0; q<10;q++){
       for (int j=0; j<10-q;j++){
         if(myArray[j]>myArray[j+1]){
           int temp = myArray[j];
           myArray[j]= myArray[j+1];
           myArray[j+1] = temp;
           
         }
       }
     }
      }
      for(int o=0;o<11; o++){
      System.out.print(myArray[o] + ",");
    }
System.out.println("");
     int low = 0, mid = 0;
    int high = myArray.length-1;
    boolean found = false;
    while (high >= low)
    {
      mid = (low + high) / 2;
      if (find < myArray[mid]) {
        high = mid - 1;
        System.out.println("low is " + low);
        System.out.println("High is " + high);
        System.out.println("mid is " + mid);
        System.out.println("Searching");
        
        }
      else if (find == myArray[mid]) {
        found = true; 
        System.out.println("low is " + low);
        System.out.println("High is " + high);
         System.out.println("mid is " + mid);
        System.out.println("Searching");
        
     
        
        break;
        }
      else low = mid + 1;
      System.out.println("low is " + low);
        System.out.println("High is " + high);
         System.out.println("mid is " + mid);
        System.out.println("Searching");
      }

     if (find != 0 ){
        System.out.println("The target is in the set.");
        }
        else{
          System.out.println("The target is not in the set.");
       }
    
    
  }
}
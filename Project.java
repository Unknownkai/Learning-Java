import java.util.Scanner;
class Project{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int[] array = new int[10000];
    int stop =0;
   while(stop == 0){
    for(int i = 0; i<array.length;i++) {
      System.out.println("Enter a number");
      int number = scan.nextInt();
      if (number != -1000){
        array[i] = number;
      }
      if (number == -1000){
        break;
      }
    }
    
    System.out.println("1. Find Smallest Number");
    System.out.println("2. Find Largest Number");
    System.out.println("3. Quit");
    int choice = scan.nextInt();

   switch(choice){

     case 1:
     int smallest = array[0];
      for (int i =0; i < array.length; i++){
      if (smallest > array[i]){
       smallest = array[i];
        }
      } 
       System.out.println("Smallest is " +smallest);
     break;

     case 2:
      int largest = array[0];
      for (int i =0; i < array.length; i++){
      if (largest < array[i]){
       largest = array[i];
        }
      } 
            System.out.println("Largest is " +largest);
     break;
     case 3:
       stop++;
      break;
   }
      
     }


    
  }
      }
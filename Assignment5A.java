import java.util.Scanner;
class Assignment5A {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.println("[Fibonacci Sequence Generator]");
    
    System.out.print("How long should the Fibonacci Sequence be?: ");
    int length = myScan.nextInt();

    while(length<=0){
        System.out.println("Sequence must be larger than 0!");
        System.out.print("How long should the Fibonacci Sequence be?: ");
         length = myScan.nextInt();
      }
    System.out.println("Okay, here's your sequence:");

    int[] Array = new int [length]; 

    Array[0] = 0;
    Array[1] = 1;
    Array[2] = 1;
    
    for (int i=3; i<length; i++ ){
      Array[i] = Array[i-2]+Array[i-1];
    }
   for(int j=0;j<Array.length;j++){
      System.out.print(Array[j]+ ",");
   }

   
    

    
    

    
  
  }
}
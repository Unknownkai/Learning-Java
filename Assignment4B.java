import java.util.Scanner;
class Assignment4B {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.print("Enter the checkerboard's width: ");
    int width = myScan.nextInt();
    while (width<=0){
      System.out.println("Please enter a valid width!");
      System.out.print("Enter the checkerboard's width: ");
      width = myScan.nextInt();
    }
    
    System.out.print("Enter the checkerboard's height: ");
    int height = myScan.nextInt();
    while (height<=0){
      System.out.println("Please enter a valid height!");
      System.out.print("Enter the checkerboard's height: ");
      height = myScan.nextInt();
      }
    
    for (int i=0; i<height; i++){
      for (int j=0; j<width; j++){
        if (i % 2 == 0){ 
          if (j % 2 ==0){
            System.out.print("■"); 
          }
          else{
            System.out.print("□");
          }
            }
          if (i % 2 != 0){
           if(j % 2 == 0){
            System.out.print("□");
          }
            else{
              System.out.print("■");
            }
         }
      }
            System.out.println("");
    }
    
  }
}
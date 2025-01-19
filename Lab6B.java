import java.util.Scanner;
import java.util.Random;
class Lab6B {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    Random rand= new Random();
    System.out.print("Enter a number between 1 and 1000: ");

    int numb = myScan.nextInt();
    int counter = 0 ;
    int rand_intl = rand.nextInt(1001);
  
    

   while (numb != rand_intl && numb > 0 && numb <=1000 ){
     rand_intl = rand.nextInt(1001);
     System.out.println("My guess is " + rand_intl);
     counter++;

   if(numb == rand_intl){
      System.out.println("I guessed the number was " +numb+ " and it only took me " +counter+ " guesses");  
   }
   }
  }
}
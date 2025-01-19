import java.util.Scanner;
import java.util.Random;
class MidtermC {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    Random myRand = new Random();

    int human = 0;
    int computer = 0;

    int counter = 1;
    
     for (int i=0; i<3; i++){
        System.out.println("Round" +counter);
        System.out.print("Do you want to Cooperate with or betray the computer player? ");
        int number = myScan.nextInt();
     
       int rand = myRand.nextInt(10);
       
       if (number < 5 && rand < 5 ){
         human--;
         computer--;
       }
       else if (number >5 && rand > 5){
         human = -2;
         computer = -2;
       }
       else if (number >5 && rand < 5){
         human = +5;
         computer = -3;
         }
        else if ( number >5 && rand < 5){
          human = -3;
          computer = +5;
        }


       counter ++;
       }
       
    System.out.println("Your score is " +human);
    System.out.println("The computer score is " +computer);

    if (computer < human){
      System.out.println("You win!");
      }
      else if(computer > human){
           System.out.println("The computer wins!");
        }
  //System.out.println("The computer wins!")
      else if (computer == human){
          System.out.println("It's a Tie!");
        }  
      

    } 
}
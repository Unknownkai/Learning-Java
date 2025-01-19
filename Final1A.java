import java.util.Scanner;
import java.util.Random;
class Final1A {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    Random myRand = new Random();
    System.out.println("[Casino Royale Roulette]");

    int counter =0;
    int money = 100;
    int target = myRand.nextInt(36);
    System.out.println("You currently have $" +money);

   do{ System.out.print("What number do you want to bet on (between 0 and 36)? ");
    int guess = myScan.nextInt();

    System.out.print("How much do you want to bet (between 1 and 100)? ");
    int bet = myScan.nextInt();

    System.out.println("... Spin the wheel ...");

    System.out.println("It landed on [" +target+ "]!");

    if(guess == target){
     int winnings = (bet*2);
      System.out.println("Congratulations, you earned" +winnings+ " dollar(s)!");
      
    }
    else {
      int lost = money - bet;
      System.out.println("Sorry, you lost "+bet+ " dollar(s).");
    }
     int winningsss = (bet*2);
     int win = winningsss+money;
   System.out.print("Do you want to quit? ");
     Char answer = myScan.nextLine();
     if (answer == 'y'){
       System.out.println("Your final winnings are " +win+ " dollar(s).");
       counter++;
     }else {
       System.out.println("You currently have $" +money);
     }
     }
     while (counter !=0);
  
      
  }
}
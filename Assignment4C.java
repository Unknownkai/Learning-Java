import java.util.Scanner;
import java.util.Random;
class Assignment4C {
  public static void main(String[] args) {
  Scanner myScan = new Scanner(System.in);
  Random rand= new Random();
    System.out.println("[Mathletes Game]");
    System.out.print("Choose a game mode (0=Easy, 1=Hard): ");
    int selection = myScan.nextInt();
    int attempts = 0;
    int end = 0;
    
  
    switch(selection){
      case 0:
        System.out.println("Playing on easy mode, huh? Okay!");
        for(int i=1; i<=5; i++){
          if (end != 0){
            break;
          }
          int rando= rand.nextInt(255+255)-255;
          int rando2= rand.nextInt(255+255)-255;
          System.out.println("Q"+i+"." +rando+ "*" +rando2+ "= ?");
          int correctAnswer = rando * rando2;
          int answer = myScan.nextInt();
          while ((answer != correctAnswer) && (attempts < 1)){
            System.out.println("Incorrect! Try again.");
            answer = myScan.nextInt();
            attempts++;
            }
          if ((attempts == 1) && (answer != correctAnswer)){
            System.out.println("Incorrect!");
            System.out.println("Game Over...");
            break;
            }
          if (answer == correctAnswer){
            System.out.println("Correct!");
            if (i==5){
              System.out.println("You win!");
            }
          }
            
         }
      break;
      case 1:
        System.out.println("So, you want a challenge? Okay!");
         for(int i=1; i<=10; i++){
          int rando= rand.nextInt(255+255)-255;
          int rando2= rand.nextInt(255+255)-255;   
        System.out.println("Q"+i+"." +rando+ "*" +rando2+ "= ?");
          int correctAnswer = rando * rando2;
          int  answer = myScan.nextInt();
           if(answer != correctAnswer){
            System.out.println("Incorrect!");
            System.out.println("Game Over...");
             break;
           }
            if (answer == correctAnswer){
              System.out.println("Correct!");
            if (i==10){
              System.out.println("You win!");
            }
            }
           }
      }

   
  }
}
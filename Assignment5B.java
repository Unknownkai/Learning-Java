import java.util.Scanner;
class Assignment5B {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.println("[Maze Game]");

    String [][] board = {
      {"_", "X", "_", "X", "X"},
      {"_", "X", "_", "X", "W"},
      {"_", "_", "_", "X", "_"},
      {"X", "X", "_", "_", "_"},
      {"_", "_", "_", "X", "X"}};    

    String direction;

    int x = 0;
    int y = 0;

    board[x][y] = "0";

    while(!board[x][y].equals("W") && !board[x][y].equals("X")){
      for (int i = 0; i<5; i++){
        for (int j = 0; j<5; j++){
          System.out.print(board[i][j]+ ".");
          if (j == 4){
            System.out.println("");
          }
        }
      }
      System.out.print("Which direction would you like to move? ");
      direction = myScan.nextLine();

      while((!direction.equalsIgnoreCase("Up") && (!direction.equalsIgnoreCase("Down")) && !direction.equalsIgnoreCase("Left") && !direction.equalsIgnoreCase("Right"))){
        System.out.println("That's not a valid direction");
        System.out.println("Which direction would you like to move?");
        direction = myScan.nextLine();
      }
      
      while((direction.equalsIgnoreCase("Up") && x==0) || (direction.equalsIgnoreCase("Down") && x==4) || (direction.equalsIgnoreCase("Right") && y==4) || (direction.equalsIgnoreCase("Left") && y==0)){
        System.out.println("You can't move there - It's out of bounds!");
        System.out.println("which direction would you like to move? ");
        direction = myScan.nextLine();
      }

      
      if (direction.equalsIgnoreCase("Up") && x!= 0){
        board[x][y] = "_";
        x--;
        if(board[x][y].equals("X")){
          System .out.println("You hit a wall - Game Over!");
        } else if (board[x][y].equals("W")){
          System.out.println("You Win!");
        } else {
          board[x][y] = "0";
        }
        
      }
      if(direction.equalsIgnoreCase("Down") && x!= 4){
        board[x][y] = "_";
        x++;
        if(board[x][y].equals("X")){
          System .out.println("You hit a wall - Game Over!");
        } else if (board[x][y].equals("W")){
          System.out.println("You Win!");
        } else {
          board[x][y] = "0";
        }
        
      }
      if(direction.equalsIgnoreCase("Right") && y!= 4){
        board[x][y] = "_";
        y++;
        if(board[x][y].equals("X")){
          System .out.println("You hit a wall - Game Over!");
        } else if (board[x][y].equals("W")){
          System.out.println("You Win!");
        } else {
          board[x][y] = "0";
        }
        
      }
      if(direction.equalsIgnoreCase("Left") && y != 0){
        board[x][y] = "_";
        y--;
        if(board[x][y].equals("X")){
          System .out.println("You hit a wall - Game Over!");
        } else if (board[x][y].equals("W")){
          System.out.println("You Win!");
        } else {
          board[x][y] = "0";
        } 
      } 
    }
  }
}
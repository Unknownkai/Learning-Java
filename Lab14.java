import java.util.Scanner;
class Lab14 {
  public static void main(String[] args) {
    Scanner intInput = new Scanner(System.in);
    Quiz qz1 = new Quiz();

    int answer;
    do{
      System.out.println("1. Add a question to the quiz");
      System.out.println("2. Remove a question from the quiz");
      System.out.println("3. Modify a question in the quiz");
      System.out.println("4. Take the quiz");
      System.out.println("5. Quit");

      answer = intInput.nextInt();

      switch (answer){
        case 1: 
          qz1.Add_Question();
          break;
          
        case 2:
          qz1.remove_Question();
          break;

        case 3:
          qz1.modify_Question();

          break;

        case 4:
          qz1.give_Quiz();
          break;

        case 5:
          
          break;
      }

      
      
    }while (answer != 5);
  }
}
import java.util.Scanner;
class Lab4B {
  public static void main(String[] args) {
    Scanner myScan= new Scanner(System.in);

    System.out.println("Enter the day: ");
    String weekDay = myScan.nextLine();
  
    if ((weekDay.equals("Monday") || (weekDay.equals("monday")))) {
      System.out.println("I have class today!");
    }
    else if ((weekDay.equals("Wednesday") || (weekDay.equals("wednesday")))) {
      System.out.println("I have class today!");
    }
    else if ((weekDay.equals("Friday") || (weekDay.equals("friday")))) {
      System.out.println("It's Friday! Friday! Gotta get down on Friday!");
    }
    else if ((weekDay.equals("Tuesday") || (weekDay.equals("tuesday")))) {
      System.out.println("I should use this time to do my homework.");
    }
    else {
      System.out.println("I should use this time to do my homework.");
    }
  }
}
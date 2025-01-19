import java.util.Scanner;
class Assignment3B {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.println("[Instructor Scheduler]");
    
    System.out.print("What day of the week is it? ");
        char weekDay = myScan.next().charAt(0);
     System.out.print("What time of day? ");
      char Time = myScan.next().charAt(0);
      
      int Rice = 0;

     switch (weekDay){
       case 'M':
       System.out.print("On Monday ");
       break;
       case 'T':
       System.out.print("On Tuesday ");
       break;
       case 'W':
       System.out.print("On Wednesday ");
       break;
       case 'R':
       System.out.print("On Thursday ");
       break;
       case 'F':
       System.out.print("On Friday ");
       break;
       default: 
        Rice++;
     }


     switch (Time){
      case 'a':
      System.out.print("Morning, ");
      break;
      case 'p':
      System.out.print("Afternoon, ");
      break;
      default: 
      Rice++;
    }

    if ((weekDay == 'M') && (Time == 'a')){
      System.out.print("You'll be teaching C++, Section E04!");
    }
    if ((weekDay == 'M') && (Time == 'p')){
      System.out.print("You'll be teaching Java, Section J02!");
    }
    if ((weekDay == 'T') && (Time == 'a')){
      System.out.print("you'll be holding office hours!");
    }
    if ((weekDay == 'T') && (Time == 'p')){
      System.out.print("You'll be teaching C#, Section W#1!");
    }
    if ((weekDay == 'W') && (Time == 'a')){
      System.out.print("You'll be teaching C#, Section #02!");
    }
    if ((weekDay == 'W') && (Time == 'p')){
      System.out.print("You'll have some free time!");
    }
    if ((weekDay == 'R') && (Time == 'a')){
      System.out.print("you'll be holding office hours!");
    }  
    if ((weekDay == 'R') && (Time == 'p')){
      System.out.print("You'll be teaching C++, Section WE3!");
    }
    if ((weekDay == 'F') && (Time == 'a')){
      System.out.print("You'll be teaching Java, Section WJ3!");
    }
    if ((weekDay == 'F') && (Time == 'p')){
      System.out.print("You'll have some free time!");
    }
    if (Rice != 0) {
      System.out.print("That's not a valid time of day!");
    }




  }
}
import java.util.Scanner;
class MidtermA {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.print("What is the base number? ");
    int base = myScan.nextInt();
    System.out.print("Pick a number 1-6 for the exponent number: ");
    int exponent = myScan.nextInt();

    switch (exponent){
      case 1: 
        System.out.println("exponent of 1");
        int mutiplyONE = (base);
        System.out.println("Your new number is " +base);
        
        break;
      case 2: 
        System.out.println("exponent of 2");
        int mutiplytwo = (base*base);
        System.out.println("Your new number is " +base);

        break;
        
      case 3:
        System.out.println("exponent of 2");
        int mutiplythree = (base*base*base);
        System.out.println("Your new number is " +base);

        break;
      case 4:
        System.out.println("exponent of 2");
        int mutiplyfour = (base*base*base*base);
        System.out.println("Your new number is " +base);

        break;
      case 5:
        System.out.println("exponent of 2");
        int mutiplyfive = (base*base*base*base*base);
        System.out.println("Your new number is " +base);

        break;
      case 6:
        System.out.println("exponent of 2");
        int mutiplysix = (base*base*base*base*base*base);
        System.out.println("Your new number is " +base);

        break;
    
      default:
          System.out.println("Exponents is out of bounds!");
          
          

      
        
        
        
        
    }
  }
}
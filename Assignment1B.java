import java.util.Scanner;

class Assignment1B {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner (System.in);
    
    System.out.println("Enter the total price of the meal: ");
    float totalPrice = myScanner.nextFloat();

    System.out.println("Enter the local tax rate: ");
    float taxRate = myScanner.nextFloat();

    System.out.println("Enter the delivery fee: ");
    float deliveryFee = myScanner.nextFloat();

    float totalTax = totalPrice * taxRate; 
    float subTotal = totalPrice + deliveryFee;
    float  tenTip = subTotal * 0.10f;

    System.out.println("A 10% tip would be $" + tenTip);
    float finalTotal = tenTip + subTotal + totalTax;
  
    System.out.println("The total would be $" + finalTotal);
    
    float twentyTip = subTotal * 0.20f;

    System.out.println("A 20% tip would be $" + twentyTip);
    finalTotal = twentyTip + subTotal + totalTax;

    System.out.println("The total would be $" + finalTotal);
    


  }
}
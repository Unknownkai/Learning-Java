import java.util.*;
class Lab15{
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    Checking checkingaccount = new Checking();
    Savings savingsaccount = new Savings();
    int keepgoing = 1;
    do{
       System.out.println("1.Withdraw from Checking");
       System.out.println("2.Withdraw from Savings");
       System.out.println("3.Deposit to Checking");
       System.out.println("4.Deposit to Savings");
       System.out.println("5.Balance of Checking");
       System.out.println("6.Balance of Savings");
       System.out.println("7.Award Interest to Savings now");
       System.out.println("8.Exit "); 
    int choice =scan.nextInt();
    switch(choice){

      case 1:
        System.out.println("How much would you like to withdraw from Checking");
        float w =scan.nextFloat();
        checkingaccount.withdrawl(w);
      break;
      case 2:
        System.out.println("How much would you like to withdraw from Savings");
        float ws =scan.nextFloat();
        savingsaccount.withdrawl(ws);
      break;
      case 3:
        System.out.println("How much would you like to deposit into Checking?");
        float d = scan.nextFloat();
        checkingaccount.deposit(d);
        System.out.println("Doing default deposit");
      break;
      case 4:
        System.out.println("How much would you like to deposit into Savings");
        float ds = scan.nextFloat();
        savingsaccount.deposit(ds);
      break;
      case 5:
        System.out.println("Your balance for checking "+checkingaccount.getAccountNumber()+ " is " + checkingaccount.getaccountbalance());
      break;
      case 6:
        System.out.println("Your balance for savings "+savingsaccount.getAccountNumber()+ " is " +savingsaccount.getaccountbalance());
      break;
      case 7:
        savingsaccount.interest();
      break;
      case 8:
        keepgoing++;
      break;    
    }
    }while(keepgoing == 1);

  }
}
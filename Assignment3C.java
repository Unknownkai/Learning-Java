import java.util.Scanner;
class Assignment3C {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.println("[App Checklist]");
    System.out.print("What mobile device do you have? ");
    String device = myScan.next();

    if ((device.equals("android") || (device.equals("Android")))) {
      System.out.print("What verison do you have? ");
    
      float verison =myScan.nextFloat();

     if (verison >=10){
        System.out.println("Congratulations, you can run this app!");
     }
      if (verison <=9){
         System.out.print("Does your device support Bluetooth connection? ");
         String connection = myScan.next();
         if (connection.equals("Yes") || (connection.equals("yes"))){
           System.out.println("Congratulations, you can run this app!");
         }
         else 
         System.out.println("I'm sorry, our app does not support your device.");
    }
    }

     if ((device.equals("apple") || (device.equals("Apple")))) {
      System.out.print("What verison do you have? ");
    
      float secverison =myScan.nextFloat();

     if (secverison >=14){
        System.out.println("Congratulations, you can run this app!");
     }
      if (secverison <=13){
         System.out.print("Does your device support NFC? ");
         String nfc = myScan.next();
         if (nfc.equals("Yes") || (nfc.equals("yes"))){
           System.out.println("Congratulations, you can run this app!");
         }
         else 
         System.out.println("I'm sorry, our app does not support your device.");
    }
     }

    if ((device.equals("Blackberry") || (device.equals("blackberry")))){
      System.out.println("I'm sorry.");

    }





  }
}
import java.util.Scanner;
class Lab11B {
  public static void main(String[] args) {
  Scanner myScan = new Scanner(System.in);
    //psw is password
  char psw = 0;
  boolean num = true;
  boolean length = false;
  boolean upperCase = false;
    
  System.out.print("Enter a password: ");
  String password = myScan.nextLine();

    char[] array = new char [password.length()];
     for(int i=0; i<password.length(); i++){
       array[i]= password.charAt(0);
     }
      if(password.length() >= 8){
        length = true; 
      }
      for(int x=0; x< password.length(); x++){
        if(Character.isUpperCase(array[x]))
          upperCase = true;
        break;
      }
    for(int o=0; o<password.length(); o++){
      int ascii = array[o];
      if(ascii < 47 && ascii >58){
        num = false; 
        break;
       }  
    
    }

  if (length == true && upperCase == true && num == true) {
     System.out.println("Valid password");
      }
   else{
     System.out.println("Invalid password");
      }
     System.out.println("Program Ends");      

      
      



    
  }
}
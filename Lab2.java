import java.util.Scanner;
class Lab2 {
  public static void main(String[] args) {
    System.out.println("Enter a name: ");
     Scanner myScanner = new Scanner (System.in);
     String firstName = myScanner.next();

     System.out.println("Enter another name: ");
     String anotherName = myScanner.next();

     System.out.println("Enter a verb: ");
     String aVerb = myScanner.next();

     System.out.println("Enter an adverb: ");
     String adVerb = myScanner.next();

     System.out.println("Once upon a time, there was a person named " + firstName + " who had a child named " + anotherName + ". This child would " + aVerb + " wickedly while " + adVerb + " to strangers.");
 
  }
}
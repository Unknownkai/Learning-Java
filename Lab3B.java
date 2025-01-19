import java.util.Scanner;
class Lab3B {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);

    System.out.println("Course 1 hours: ");
    int Course1 = myScan.nextInt();
    System.out.println("Grade for course 1");
    int gradeCourse1 = myScan.nextInt();

    System.out.println("Course 2 hours: ");
    int Course2 = myScan.nextInt();
    System.out.println("Grade for course 2: ");
    int gradeCourse2 = myScan.nextInt();

    System.out.println("Course 3 hours: ");
    int Course3 = myScan.nextInt();
    System.out.println("Grade for course 3: ");
    int gradeCourse3 = myScan.nextInt();

     System.out.println("Course 4 hours: ");
    int Course4 = myScan.nextInt();
    System.out.println("Grade for course 4: ");
    int gradeCourse4 = myScan.nextInt();
    
    float totalHours = Course1 + Course2 + Course3 + Course4;
    System.out.println("Total hours is: " + totalHours);

    float qualityPoints = (Course1 * gradeCourse1) + (Course2 * gradeCourse2) + (Course3 * gradeCourse3) + (Course4 * gradeCourse4);
    System.out.println("Total quality Points is: " + qualityPoints);

    float Gpa = qualityPoints / totalHours;
    System.out.println("Your GPA for this semester is " + Gpa);

    
  }
}
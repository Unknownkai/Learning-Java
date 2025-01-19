class Final1B {
public static float convert_to_CMYL(float[] x, char y){
  float[] myArray = new float[3];
  float r =  10;
  float g = 20;
  float b = 30;

  myArray[0] = r;
  myArray[1] = g; 
  myArray[2] = b;

  float normal = myArray[0] / 255.0f;
  float normal2 = myArray[1] / 255.0f;
  float normal3 = myArray[2] / 255.0f;
  float k = (1-r)(1-g)(1-b);

 float c = (1 - r - k) / (1 - k);

  float m = (1 - g - k) / (1 - k);

  float y = (1 - b - k) / (1 - k);
  
  

  
  
} 
  
  public static void main(String[] args) {
    import java.util.Scanner;
    Scanner myScan = new Scanner(System.in);
    System.out.println("[Printer Shop Palettes]");

    System.out.println("Please enter the RGB color you want to conver to CMKY");
    System.out.print("R: ");
    int answer = myScan.nextInt();
     System.out.print("G: ");
    int answer2 = myScan.nextInt();
     System.out.print("B: ");
    int answer3 = myScan.nextInt();
    
    System.out.println("The CMYK equivalent color is: ");
    
    convert_to_CMYL = c *100;
    convert_to_CMYL = m *100;
    convert_to_CMYL = y *100;
    convert_to_CMYL = k *100;

    System.out.println("("+c+"%, " +m+ "%, " +y+ "%, " +k+ "%)");

    
  }
}
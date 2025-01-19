import java.util.Scanner;
class Lab13 {
    
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    StockItem item1 = new StockItem("1 gallon of milk", 3.60f, 15);
    StockItem item2 = new StockItem("1 loaf of bread", 1.98f, 30);

    int answer;
do{
    System.out.println("1. Sold One Milk");
    System.out.println("2. Sold One Bread");
    System.out.println("3. Change price of Milk");
    System.out.println("4. Change price of Bread");
    System.out.println("5. Add Milk to Inventory");
    System.out.println("6. Add Bread to Inventory");
    System.out.println("7. See Inventory");
    System.out.println("8. Quit");

    answer = scan.nextInt();

    switch (answer){
      case 1:
        item1.lowerQuantity(1);
        
        break;

      case 2:
        item2.lowerQuantity(1);
        
        break;

      case 3: 
        System.out.println("What is the new price for Milk");
          float newPrice = scan.nextFloat();
            item1.changePrice(newPrice);

        break;

      case 4:
        System.out.println("What is the new price for Bread");
          float newBreadPrice = scan.nextFloat();
        item2.changePrice(newBreadPrice);

        break;

      case 5:
        System.out.println("How many milks did we get");
          int addmilk = scan.nextInt();
          item1.raiseQuantity(addmilk);            

        break;

      case 6:
         System.out.println("How many bread did we get");
          int addbread = scan.nextInt();
          item2.raiseQuantity(addbread);

        break;

      case 7:
        System.out.println(item1.toString());
        System.out.println(item2.toString());

        break;

      case 8:

        break;
    } 
  } while (answer != 8);
}
}

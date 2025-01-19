class Main {
  public static void main(String[] args) {
    System.out.println("[Fashion Boutique Display]");

    Mannequin m1 = new Mannequin();

    Mannequin m2 = new Mannequin(2, "Beret" , "Hawaiian Shirt", "Soap Shoes");
    Mannequin m3 = new Mannequin(3, "Sun Hat", "Blue Dress", "Heels");


    System.out.println("Here is your Avant-Garde Ensemble:");

    System.out.println("Mannequin #" +m2.Id+ " is wearing " +m2.outfit+ " paired with " +m2.shoes+ ", and is accessoriizing with a " +m2.hat);
  
  }
}
package aup.cs.shop;

public class Shop {
  public static void main(String[] args) {
    ShavingProduct testSP = new ShavingProduct("Test", 100);
    PreShave testPS = new PreShave("Test", 100);
    Razors testRazor = new Razors("Test", 100);
    System.out.println("The first product's ID is " + testSP.getId());
    System.out.println("The second's ID is " + testPS.getId());
    System.out.println("The third's ID is " + testRazor.getId());
    System.out.println(createFeed());
  }

  public static ShavingProduct[] init(){
    Brushes brush1 = new Brushes("Fine Horn Shaving Brush", 185.00, "Badger Fur");
    Brushes brush2 = new Brushes("Engraved Silvertip Shaving Brush", 250.00, "Silvertip Badger Fur");
    Creams cream1 = new Creams("Lavender Shaving Cream", 12.00);
    Creams cream2 = new Creams("Unscented Shaving Cream", 12.50);
    PostShave post1 = new PostShave("Lavender After-Shave Balm", 12.50);
    PostShave post2 = new PostShave("Bergamot Neroli After-Shave Balm", 12.50);
    PreShave pre1 = new PreShave("Unscented Pre-Shave Oil", 15.00);
    PreShave pre2 = new PreShave("Lavender Pre-Shave Oil", 15.00);
    Razors razor1 = new Razors("Shavette Straight Razor", 60.00);
    Razors razor2 = new Razors("Bocote Wood Straight Razor", 280.00);
    Shave shave1 = new Shave("The Gifted Groomer Kit", 35.00);
    Shave shave2 = new Shave("The Festive Duo Kit", 35.00);
    Soaps soap1 = new Soaps(true, "Lavender Shaving Soap Refill", 30.00);
    Soaps soap2 = new Soaps(false, "Sandalwood Shaving Soap Refill", 30.00);
    ShavingProduct[] arraySP = {brush1, brush2, cream1, cream2, post1, post2, pre1, pre2, razor1, razor2, shave1, shave2, soap1, soap2};
    return arraySP;
  }

  public static String createFeed(){
    String feed = "id \t title \t price \t category \t material \n";
    ShavingProduct[] products = init();
    for(int i = 0; i < products.length; i++){
      feed += products[i].toString() + "\n";
    }
    return feed;
  }
}

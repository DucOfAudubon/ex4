package aup.cs.shop;

import java.util.ArrayList;

public class Shop {
  public static void main(String[] args) {
    System.out.println(createFeed());
  }

  public static Product[] init(){
    Brushes brush1 = new Brushes("Fine Horn Shaving Brush", 185.00, true, "Badger Fur");
    Brushes brush2 = new Brushes("Engraved Silvertip Shaving Brush", 250.00, true, "Silvertip Badger Fur");
    Creams cream1 = new Creams("Lavender Shaving Cream", 12.00, true);
    Creams cream2 = new Creams("Unscented Shaving Cream", 12.50, true);
    PostShave post1 = new PostShave("Lavender After-Shave Balm", 12.50, true);
    PostShave post2 = new PostShave("Bergamot Neroli After-Shave Balm", 12.50, true);
    PreShave pre1 = new PreShave("Unscented Pre-Shave Oil", 15.00, true);
    PreShave pre2 = new PreShave("Lavender Pre-Shave Oil", 15.00, true);
    Razors razor1 = new Razors("Shavette Straight Razor", 60.00, true);
    Razors razor2 = new Razors("Bocote Wood Straight Razor", 280.00, true);
    Shave shave1 = new Shave("The Gifted Groomer Kit", 35.00, true);
    Shave shave2 = new Shave("The Festive Duo Kit", 35.00, true);
    Soaps soap1 = new Soaps(true, "Lavender Shaving Soap Refill", 30.00, true);
    Soaps soap2 = new Soaps(false, "Sandalwood Shaving Soap Refill", 30.00, true);
    Beard beard1 = new Beard("Beard Wash and Conditioner", 30.00, true);
    Beard beard2 = new Beard("Beard Styling Trimmer", 100.00, true);
    SkinCare skin1 = new SkinCare("Peppermint Facial Scrub", 25.00, false);
    SkinCare skin2 = new SkinCare("Power Brush", 40.00, false);
    Hair hair1 = new Hair("Small Horn Comb", 40.00, true);
    Hair hair2 = new Hair("Large Horn Comb", 75.00, true);
    Product[] arrayP = {brush1, brush2, cream1, cream2, post1, post2, pre1, pre2, razor1, razor2, shave1, shave2, soap1, soap2, beard1, beard2, skin1, skin2, hair1, hair2};
    return arrayP;
  }

  public static String createFeed(){
    String feed = "id \t title \t price \t category \t material \n";
    ArrayList<Product> prodsList = fillShop();
    for(Product i : prodsList){
      feed += i.toString() + "\n";
    }
    return feed;
  }

  public static String createMenFeed(){
    String feed = "id \t title \t price \t category \t material \n";
    ArrayList<Product> prodsList = fillShop();
    for(Product i : prodsList){
      if(i.isMale()) {
        feed += i.toString() + "\n";
      }
    }
    return feed;
  }

  public static String createWomenFeed(){
    String feed = "id \t title \t price \t category \t material \n";
    ArrayList<Product> prodsList = fillShop();
    for(Product i : prodsList){
      if(!i.isMale()) {
        feed += i.toString() + "\n";
      }
    }
    return feed;
  }

  public static ArrayList<Product> fillShop(){
    Product[] products = init();
    ProductList prodsList = new ProductList(products);
    return prodsList.getAllProducts();
  }
}

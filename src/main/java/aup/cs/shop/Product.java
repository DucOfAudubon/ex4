package aup.cs.shop;

/**
 * This will be the superclass for all products.
 */
public class Product {
    /**
     * To ensure that all ids are unique, ids will increase with every Product created
     */
    private static long totalIds;
    private long id;
    private String title;
    private double price;
    private boolean isMale;

    /**
     * Constructor without consideration of if it's instock. Assumes it is in stock
     * @param title The name of the product
     * @param price The price of the product, in dollars, to the cent
     * @param isMale if it's a product for men. Mutually exclusive with women's products
     */
    protected Product(String title, double price, boolean isMale){
        this(true, title, price, isMale);
    }

    /**
     * Constructor with the same as above, plus in stock
     * @param inStock If this is false, then price will be set to -1
     * @param title
     * @param price
     * @param isMale
     */
    protected Product(boolean inStock, String title, double price, boolean isMale){
        totalIds++;
        this.id = totalIds;
        this.title = title;
        this.isMale = isMale;
        if(inStock){
            this.price = price;
        }
        else{
            this.price = -1;
        }
    }

    /**
     * To allow for fewer getters, this will put all the variable info into a readable string
     * @return The fields of the Product separated by tabs
     */
    public String toString(){
        String stringForm = id + "\t" + title + "\t" + price;
        return stringForm;
    }

    /**
     * Gets the ID. Not forbidden in the readme, and really convenient
     * If this needs to be changed, just use regex to extract the ID from the toString
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     * Lets you know if it's a man's product
     * If this needs changing, making all cosmetics female products and all shaving products men's products
     * is a decent and simple idea
     * Even if it is nonsense. :Shrug:
     * @return
     */
    public boolean isMale(){
        return isMale;
    }
}

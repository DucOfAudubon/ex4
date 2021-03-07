package aup.cs.shop;

public class Cosmetics extends Product{
    private String category = "Cosmetics";

    /**
     * Nothing new here. Uses the super's constructor
     * @param title
     * @param price
     * @param isMale
     */
    protected Cosmetics(String title, double price, boolean isMale){
        super(title, price, isMale);
    }

    /**
     * This one is currently unnecessary, but good if we want to expand capabilities
     * @param inStock
     * @param title
     * @param price
     * @param isMale
     */
    protected Cosmetics(boolean inStock, String title, double price, boolean isMale){
        super(inStock, title, price, isMale);
    }

    /**
     * appends the category to the toString of the super
     * @return
     */
    public String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + category;
        return stringForm;
    }
}

package aup.cs.shop;

/**
 * Superclass for PreShave, PostShave, and, of course, the infamous Shave
 */
public class ShavingProduct extends Product{
    private String category = "Shaving Product";

    protected ShavingProduct(String title, double price, boolean isMale){
        super(title, price, isMale);
    }

    protected ShavingProduct(boolean inStock, String title, double price, boolean isMale){
        super(inStock, title, price, isMale);
    }

    /**
     * appends the category to the previous toString, with the >
     * @return
     */
    public String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + category;
        return stringForm;
    }
}

package aup.cs.shop;

public final class Soaps extends Shave{

    /**
     * Soaps can be out of stock, so need the instock constructor
     * @param inStock If it's available. If it's not, price will be -1
     * @param title
     * @param price
     * @param isMale
     */
    public Soaps(boolean inStock, String title, double price, boolean isMale){
        super(inStock, title, price, isMale);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += " > Soaps";
        return stringForm;
    }
}


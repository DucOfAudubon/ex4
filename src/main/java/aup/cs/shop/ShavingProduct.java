package aup.cs.shop;

public class ShavingProduct extends Product{
    private String category = "Shaving Product";

    protected ShavingProduct(String title, double price, boolean isMale){
        super(title, price, isMale);
    }

    protected ShavingProduct(boolean inStock, String title, double price, boolean isMale){
        super(inStock, title, price, isMale);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + category;
        return stringForm;
    }
}

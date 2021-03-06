package aup.cs.shop;

public class Shave extends ShavingProduct{
    private String category = "Shave";

    protected Shave(String title, double price, boolean isMale){
        super(title, price, isMale);
    }

    protected Shave(boolean inStock, String title, double price, boolean isMale){
        super(inStock, title, price, isMale);
    }

    protected String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + category;
        return stringForm;
    }
}

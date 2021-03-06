package aup.cs.shop;

public class Cosmetics extends Product{
    private String category = "Cosmetics";

    protected Cosmetics(String title, double price, boolean isMale){
        super(title, price, isMale);
    }

    protected Cosmetics(boolean inStock, String title, double price, boolean isMale){
        super(inStock, title, price, isMale);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + category;
        return stringForm;
    }
}

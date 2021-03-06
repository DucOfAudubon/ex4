package aup.cs.shop;

public final class Beard extends ShavingProduct{
    private String category = "Beard";

    public Beard(String title, double price, boolean isMale){
        super(title, price, isMale);
    }

    public Beard(boolean inStock, String title, double price, boolean isMale){
        super(inStock, title, price, isMale);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + category;
        return stringForm;
    }
}

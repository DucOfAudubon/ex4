package aup.cs.shop;

public class Shave extends ShavingProduct{
    private String category = "Shave";

    public Shave(String title, double price){
        super(title, price);
    }

    public Shave(boolean inStock, String title, double price){
        super(inStock, title, price);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + category;
        return stringForm;
    }
}

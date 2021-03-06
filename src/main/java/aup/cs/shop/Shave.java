package aup.cs.shop;

public class Shave extends ShavingProduct{

    protected Shave(String title, double price, boolean isMale){
        super(title, price, isMale);
    }

    protected Shave(boolean inStock, String title, double price, boolean isMale){
        super(inStock, title, price, isMale);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + " > Shave";
        return stringForm;
    }
}

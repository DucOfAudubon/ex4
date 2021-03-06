package aup.cs.shop;

public final class Hair extends Cosmetics{
    private String category = " > Hair";

    public Hair(String title, double price, boolean isMale){
        super(title, price, isMale);
    }

    public Hair(boolean inStock, String title, double price, boolean isMale){
        super(inStock, title, price, isMale);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + category;
        return stringForm;
    }
}

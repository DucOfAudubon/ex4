package aup.cs.shop;

public final class SkinCare extends Cosmetics{
    private String category = " > Skin Care";

    public SkinCare(String title, double price, boolean isMale){
        super(title, price, isMale);
    }

    public SkinCare(boolean inStock, String title, double price, boolean isMale){
        super(inStock, title, price, isMale);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + category;
        return stringForm;
    }
}

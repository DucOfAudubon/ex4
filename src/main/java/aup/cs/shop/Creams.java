package aup.cs.shop;

public final class Creams extends Shave{

    public Creams(String title, double price, boolean isMale){
        super(title, price, isMale);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += " > Creams";
        return stringForm;
    }
}

package aup.cs.shop;

public final class Soaps extends Shave{

    public Soaps(boolean inStock, String title, double price, boolean isMale){
        super(inStock, title, price, isMale);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += " > Soaps";
        return stringForm;
    }
}


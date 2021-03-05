package aup.cs.shop;

public class Soaps extends Shave{

    public Soaps(boolean inStock, String title, double price){
        super(inStock, title, price);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += " > Soaps";
        return stringForm;
    }
}


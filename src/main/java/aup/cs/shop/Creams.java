package aup.cs.shop;

public class Creams extends Shave{

    public Creams(String title, double price){
        super(title, price);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += " > Creams";
        return stringForm;
    }
}

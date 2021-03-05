package aup.cs.shop;

public class Razors extends Shave{

    public Razors(String title, double price){
        super(title, price);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += " > Razors";
        return stringForm;
    }
}

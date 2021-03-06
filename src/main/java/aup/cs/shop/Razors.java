package aup.cs.shop;

public final class Razors extends Shave{

    public Razors(String title, double price, boolean isMale){
        super(title, price, isMale);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += " > Razors";
        return stringForm;
    }
}

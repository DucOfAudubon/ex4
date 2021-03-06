package aup.cs.shop;

public final class Brushes extends Shave{
    private String material;

    public Brushes(String title, double price, boolean isMale, String material){
        super(title, price, isMale);
        this.material = material;
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += " > Brushes \t" + material;
        return stringForm;
    }
}

package aup.cs.shop;

public class Brushes extends Shave{
    private String material;

    public Brushes(String title, double price, String material){
        super(title, price);
        this.material = material;
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += " > Brushes \t" + material;
        return stringForm;
    }
}

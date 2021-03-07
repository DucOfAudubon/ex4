package aup.cs.shop;

public final class Brushes extends Shave{
    private String material;

    /**
     * This constructor is different, as Brushes need a material
     * @param title
     * @param price
     * @param isMale
     * @param material What the brush is made of? I guess? I'm assuming it's the actual brush part, not the handle
     */
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

package aup.cs.shop;

public class PreShave extends ShavingProduct{
    private String category = "Pre-Shave";

    public PreShave(String title, double price){
        super(title, price);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + category;
        return stringForm;
    }
}

package aup.cs.shop;

public final class PreShave extends ShavingProduct{
    private String category = "Pre-Shave";

    public PreShave(String title, double price, boolean isMale){
        super(title, price, isMale);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + category;
        return stringForm;
    }
}

package aup.cs.shop;

public final class PreShave extends ShavingProduct{

    public PreShave(String title, double price, boolean isMale){
        super(title, price, isMale);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + " > Pre-Shave";
        return stringForm;
    }
}

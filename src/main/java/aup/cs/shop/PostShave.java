package aup.cs.shop;

public final class PostShave extends ShavingProduct{
    private String category = "Post-Shave";

    public PostShave(String title, double price, boolean isMale){
        super(title, price, isMale);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + category;
        return stringForm;
    }
}

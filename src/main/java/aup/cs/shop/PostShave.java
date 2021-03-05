package aup.cs.shop;

public class PostShave extends ShavingProduct{
    private String category = "Post-Shave";

    public PostShave(String title, double price){
        super(title, price);
    }

    public String toString(){
        String stringForm = super.toString();
        stringForm += "\t" + category;
        return stringForm;
    }
}

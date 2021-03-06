package aup.cs.shop;

public class ShavingProduct {
    private static long totalIds;
    private long id;
    private String title;
    private double price;
    private boolean isMale;

    protected ShavingProduct(String title, double price, boolean isMale){
        this(true, title, price, isMale);
    }

    protected ShavingProduct(boolean inStock, String title, double price, boolean isMale){
        totalIds++;
        this.id = totalIds;
        this.title = title;
        this.isMale = isMale;
        if(inStock){
            this.price = price;
        }
        else{
            this.price = -1;
        }
    }

    public String toString(){
        String stringForm = id + "\t" + title + "\t" + price;
        return stringForm;
    }

    public long getId() {
        return id;
    }

    public boolean isMale(){
        return isMale;
    }
}

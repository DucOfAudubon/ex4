package aup.cs.shop;

public class ShavingProduct {
    private static long totalIds;
    private long id;
    private String title;
    private double price;

    public ShavingProduct(String title, double price){
        this(true, title, price);
    }

    public ShavingProduct(boolean inStock, String title, double price){
        totalIds++;
        this.id = totalIds;
        this.title = title;
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
}

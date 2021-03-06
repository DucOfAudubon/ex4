package aup.cs.shop;

import aup.cs.shop.Beard;
import aup.cs.shop.ShavingProduct;
import java.util.ArrayList;


public class ProductList {
    private ArrayList<Product> allProducts = new ArrayList<Product>();

    public ProductList(Product[] products){
        for(int i = 0; i < products.length; i++){
            this.allProducts.add(products[i]);
        }
    }

    public ArrayList<Product> getAllProducts() {
        return allProducts;
    }

    public void removeById(long id){
        for(Product i : allProducts){
            if(id == i.getId()){
                this.allProducts.remove(i);
            }
        }
    }
}

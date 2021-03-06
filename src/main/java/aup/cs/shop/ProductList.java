package aup.cs.shop;

import aup.cs.shop.Beard;
import aup.cs.shop.ShavingProduct;
import java.util.ArrayList;


public class ProductList {
    private ArrayList<ShavingProduct> allProducts = new ArrayList<ShavingProduct>();

    public ProductList(ShavingProduct[] shavingProducts){
        for(int i = 0; i < shavingProducts.length; i++){
            this.allProducts.add(shavingProducts[i]);
        }
    }

    public ArrayList<ShavingProduct> getAllProducts() {
        return allProducts;
    }
}

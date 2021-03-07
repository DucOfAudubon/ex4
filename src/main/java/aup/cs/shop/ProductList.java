package aup.cs.shop;

import java.util.ArrayList;
import java.util.Collections;

public class ProductList {
    private ArrayList<Product> allProducts = new ArrayList<Product>();

    /**
     * Constructor for a ProductList that takes an array of Products
     * and creates the same in ArrayList form
     * @param products the Product array you want in ArrayList form
     */
    public ProductList(Product[] products){
        for(int i = 0; i < products.length; i++){
            this.allProducts.add(products[i]);
        }
    }

    /**
     * Gets the previously created ArrayList of Products
     * @return
     */
    public ArrayList<Product> getAllProducts() {
        return allProducts;
    }

    /**
     * Most interesting one so far
     * Searches through the ArrayList and removes any Product with the right id
     * Since every Product has a unique id, this should never remove more than one Product
     * @param id the id of the product you want voted off the island
     */
    public void removeById(long id) {
        for (Product i : allProducts) {
            if (id == i.getId()) {
                this.allProducts.remove(i);
            }
        }
    }
}

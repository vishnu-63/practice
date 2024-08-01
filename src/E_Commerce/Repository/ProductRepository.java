package E_Commerce.Repository;

import E_Commerce.Model.Product;

import java.time.Period;
import java.util.HashMap;

public class ProductRepository {
    HashMap<String, Product> products;
    public ProductRepository() {
        this.products=new HashMap<>();
    }
    public void addProduct(Product product){
        if(products.get(product.getProductId())!=null){
            throw new RuntimeException();
        }
        products.put(product.getProductId(),product);

    }

    public Product getProduct(String productId){
        Product product=products.get(productId);
        return product;
    }
}

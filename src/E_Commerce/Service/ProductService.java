package E_Commerce.Service;

import E_Commerce.Model.Product;
import E_Commerce.Repository.ProductRepository;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String addProduct(Product product){
        productRepository.addProduct(product);
        return product.getProductId();
    }
    public Product getPRoductDetails(String productId) {
        return productRepository.getProduct(productId);
    }
}

package com.example.onlineretailertomforsell;

public interface ProductRepository {
    void addProduct(Product newProduct);
    
    // FROM ANDY: Yo could just pass the id in for this method.
    boolean deleteProduct(Product delProduct);
    
    // Generally you pass in just the new product (plus maybe an id)
    boolean updateProduct(Product oldProduct, Product newProduct);
}

package com.example.onlineretailertomforsell;

public interface ProductRepository {
    void addProduct(Product newProduct);
    boolean deleteProduct(Product delProduct);
    boolean updateProduct(Product oldProduct, Product newProduct);
}

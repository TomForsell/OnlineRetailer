package com.example.onlineretailertomforsell;

public interface ProductService {
    void addToStock(Product newProduct);
    boolean deleteFromStock(Product delProduct);
    boolean updateStock(Product oldProduct, Product newProduct);
}

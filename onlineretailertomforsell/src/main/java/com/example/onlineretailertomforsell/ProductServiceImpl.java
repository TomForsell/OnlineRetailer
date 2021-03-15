package com.example.onlineretailertomforsell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository;

    @Override
    public void addToStock(Product newProduct) {
        repository.addProduct(newProduct);
    }

    @Override
    public boolean deleteFromStock(Product delProduct) {
        return repository.deleteProduct(delProduct);
    }

    @Override
    public boolean updateStock(Product oldProduct, Product newProduct) {
        return repository.updateProduct(oldProduct,newProduct);
    }

    @Override
    public String toString() {
        return "ProductServiceImpl{" +
                "repository=" + repository +
                '}';
    }
}

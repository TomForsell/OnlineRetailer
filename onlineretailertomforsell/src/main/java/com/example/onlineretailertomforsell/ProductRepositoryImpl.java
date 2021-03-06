package com.example.onlineretailertomforsell;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository{
    List<Product> productList =new ArrayList<Product>();

    @Override
    public void addProduct(Product newProduct) {
        productList.add(newProduct);
    }

    @Override
    public boolean deleteProduct(Product delProduct) {
        if(productList.contains(delProduct)){
            productList.remove(delProduct);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean updateProduct(Product oldProduct, Product newProduct) {

        if(productList.contains(oldProduct)){
            productList.remove(oldProduct);
            productList.add(newProduct);
            return true;
        }
        else {
            return false;
        }


    }

    @Override
    public String toString() {
        return "ProductRepositoryImpl{" +
                "productList=" + productList +
                '}';
    }
}

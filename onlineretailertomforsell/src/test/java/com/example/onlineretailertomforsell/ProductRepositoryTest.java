package com.example.onlineretailertomforsell;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class ProductRepositoryTest {

    private ProductRepository myRepository;
    private Product testProduct;
    @Before
    public void setup(){
        myRepository = new ProductRepositoryImpl();
        testProduct = new Product(1,"testProduct",555.55);
        }

    @org.junit.Test
    public void addProduct() {
        myRepository.addProduct(testProduct);
        assertEquals(myRepository.toString(),"ProductRepositoryImpl{productList=[Product{id=1, productName='testProduct', price=555.55}]}");


    }

    @org.junit.Test
    public void deleteProduct() {
    }
}
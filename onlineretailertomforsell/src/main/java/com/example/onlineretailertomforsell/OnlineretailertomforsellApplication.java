package com.example.onlineretailertomforsell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnlineretailertomforsellApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(OnlineretailertomforsellApplication.class, args);
        ProductService retailerService = ctx.getBean(ProductService.class);

        initialiseProductsAndPerformActions(retailerService);

    }


    private static void initialiseProductsAndPerformActions(ProductService retailerService) {
        Product firstProduct = new Product(1,"bike",45.00);
        retailerService.addToStock(firstProduct);
        Product secondProduct = new Product(2,"gloves",5.00);
        retailerService.addToStock(secondProduct);
        Product thirdProduct = new Product(3,"hat",500.00);
        retailerService.addToStock(thirdProduct);
        System.out.println("Products in stock after initialisation" + retailerService.toString());
        deleteProductFromStock(retailerService, firstProduct);
        UpdateProductTest(retailerService, thirdProduct);
    }

    private static void UpdateProductTest(ProductService retailerService, Product thirdProduct) {
        Product updatedProduct = new Product(3,"newHat",890999.00);
        retailerService.updateStock(thirdProduct,updatedProduct);
        System.out.println("product list after updated product " + retailerService.toString());
    }

    private static void deleteProductFromStock(ProductService retailerService, Product firstProduct) {
        retailerService.deleteFromStock(firstProduct);
        System.out.println("Products in stock after delete" + retailerService.toString());
    }
}

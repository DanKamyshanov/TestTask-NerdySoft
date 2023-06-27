package org.danylo.factory;

import org.danylo.entity.product.Product;
import org.danylo.entity.product.RealProduct;
import org.danylo.entity.product.VirtualProduct;

import java.time.LocalDate;

public class ProductFactory {
    public static Product createRealProduct(String name, double price, int size, int weight){
        return new RealProduct(name, price, size, weight);
    }

    public static Product createVirtualProduct(String name, double price, String code, LocalDate expirationDate){
        return new VirtualProduct(name, price, code, expirationDate);
    }
}

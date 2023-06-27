package org.danylo.entity.product;

import org.danylo.entity.product.Product;

import java.time.LocalDate;

public class VirtualProduct extends Product {
    private String code;
    private LocalDate expirationDate;
    public VirtualProduct(String name, double price, String code, LocalDate expirationDate){
        super(name, price);
        this.code = code;
        this.expirationDate = expirationDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "VirtualProduct{" +
                "code='" + code + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
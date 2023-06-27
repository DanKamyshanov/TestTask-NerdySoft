package org.danylo.entity.product;

import org.danylo.entity.product.Product;

public class RealProduct extends Product {
    private int size;
    private int weight;

    public RealProduct(String name, double price, int size, int weight){
        super(name, price);
        this.size = size;
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "RealProduct{" +
                "size=" + size +
                ", weight=" + weight +
                '}';
    }
}

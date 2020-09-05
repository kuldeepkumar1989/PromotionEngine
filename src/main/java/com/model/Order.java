package com.model;

import java.util.List;

public class Order
{
    private int orderID;
    private List<Product> products;

    public Order(int orderId, List<Product> _prods)
    {
        this.orderID = orderId;
        this.products = _prods;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
package com.service;

import com.model.Order;
import com.model.Product;
import com.model.Promotion;

import java.util.List;


public interface ProductService {
    void getPriceByType(Product product);

    double getTotalPrice(Order order, List<Promotion> promotionList);
}

package com;

import com.model.Order;
import com.model.Product;
import com.model.Promotion;
import com.service.ProductService;
import com.serviceImpl.ProductServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PromoEngine {
    public static void main(String args[])
        {
            ProductService productService = new ProductServiceImpl();


            Map<String, Integer> mapA = new HashMap<>();
            mapA.put("A", 3);
            Map<String, Integer> mapB = new HashMap<>();
            mapB.put("B", 2);
            Map<String, Integer> mapCD = new HashMap<>();
            mapCD.put("C", 1);
            mapCD.put("D", 1);

            List<Promotion> promotionList = new ArrayList<>();

            promotionList.add(new Promotion(1, mapA, 130));
            promotionList.add(new Promotion(2, mapB, 45));
            promotionList.add(new Promotion(3, mapCD, 30));


            //create orders
            List<Order> orderList = new ArrayList<>();
            List<Product> productList1 = new ArrayList<>();

            productList1.add(new Product("A"));
            productList1.add(new Product("B"));
            productList1.add(new Product("C"));
            orderList.add(new Order(1, productList1));

            List<Product> productList2 = new ArrayList<>();
            productList2.add(new Product("A"));
            productList2.add(new Product("A"));
            productList2.add(new Product("A"));
            productList2.add(new Product("A"));
            productList2.add(new Product("A"));
            productList2.add(new Product("B"));
            productList2.add(new Product("B"));
            productList2.add(new Product("B"));
            productList2.add(new Product("B"));
            productList2.add(new Product("B"));
            productList2.add(new Product("C"));
            orderList.add(new Order(2, productList2));

            List<Product> productList3 = new ArrayList<>();
            productList3.add(new Product("A"));
            productList3.add(new Product("A"));
            productList3.add(new Product("A"));
            productList3.add(new Product("B"));
            productList3.add(new Product("B"));
            productList3.add(new Product("B"));
            productList3.add(new Product("B"));
            productList3.add(new Product("B"));
            productList3.add(new Product("D"));

            orderList.add(new Order(3, productList3));

            for(Order order: orderList){
                double totalPrice = productService.getTotalPrice(order, promotionList);
                //double actualPrice = order.getProducts().stream().mapToDouble(p-> p.getPrice()).sum();

                System.out.println("Total Price : "+totalPrice);
               // System.out.println("ActualPrice : "+actualPrice);
            }

        }
}

package com.serviceImpl;

import com.model.Order;
import com.model.Product;
import com.model.Promotion;
import com.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    public void getPriceByType(Product product) {
        switch (product.getId()) {
            case "A":
                product.setPrice(50);

                break;
            case "B":
                product.setPrice(30);

                break;
            case "C":
                product.setPrice(20);

                break;
            case "D":
                product.setPrice(15);
                break;
        }
    }

    public double getTotalPrice(Order orders, List<Promotion> promotionList)
    {
        int counterOfA = 0;
        double priceOfA = 0;
        int counterOfB = 0;
        double priceOfB=0;
        int counterOfC = 0;
        double priceOfC=0;
        int counterOfD = 0;
        double priceOfD = 0;
        int quantityA =0;
        int quantityB =0;
        int quantityC =0;
        int quantityD =0;

        double priceA=0;
        double priceB=0;
        double priceC=0;
        double priceD=0;

        for(Product pr : orders.getProducts())
        {
            switch (pr.getId())
            {
                case "A":
                case "a":
                    counterOfA += 1;
                    priceOfA = pr.getPrice();
                    for(Promotion promotion: promotionList){
                        if(promotion.getProductInfoMap().get(pr.getId()) != null){
                            quantityA = promotion.getProductInfoMap().get(pr.getId());
                            priceA = promotion.getPromotionPrice();
                        }
                    }
                     break;
                case "B":
                case "b":
                    counterOfB += 1;
                    priceOfB = pr.getPrice();
                    for(Promotion promotion: promotionList){
                        if(promotion.getProductInfoMap().get(pr.getId()) != null){
                            quantityB = promotion.getProductInfoMap().get(pr.getId());
                            priceB = promotion.getPromotionPrice();
                        }
                    }
                    break;
                case "C":
                case "c":
                    counterOfC += 1;
                    priceOfC = pr.getPrice();
                    for(Promotion promotion: promotionList){
                        if(promotion.getProductInfoMap().get(pr.getId()) != null){
                            quantityC = promotion.getProductInfoMap().get(pr.getId());
                            priceC = promotion.getPromotionPrice();
                        }
                    }
                    break;
                case "D":
                case "d":
                    counterOfD += 1;
                    priceOfD = pr.getPrice();
                    for(Promotion promotion: promotionList){
                        if(promotion.getProductInfoMap().get(pr.getId()) != null){
                            quantityD = promotion.getProductInfoMap().get(pr.getId());
                            priceD = promotion.getPromotionPrice();
                        }
                    }
                    break;
            }
        }
        double totalPriceOfA = (counterOfA / quantityA) * priceA + (counterOfA % quantityA * priceOfA);
        double totalPriceOfB = (counterOfB / quantityB) * priceB + (counterOfB % quantityB * priceOfB);
        double totalPriceOfC = (counterOfC * priceOfC);
        double totalPriceOfD = (counterOfD * priceOfD);
        return totalPriceOfA + totalPriceOfB + totalPriceOfC + totalPriceOfD;
    }
}



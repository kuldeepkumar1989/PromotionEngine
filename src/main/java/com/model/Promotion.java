package com.model;

import java.util.Map;

public class Promotion {

    public int promotionId;
    public Map<String, Integer> productInfoMap;
    public double promotionPrice;

    public Promotion(int id, Map map, double price){
        this.promotionId = id;
        this.productInfoMap = map;
        this.promotionPrice = price;
    }

    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    public Map<String, Integer> getProductInfoMap() {
        return productInfoMap;
    }

    public void setProductInfoMap(Map<String, Integer> productInfoMap) {
        this.productInfoMap = productInfoMap;
    }

    public double getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(double promotionPrice) {
        this.promotionPrice = promotionPrice;
    }
}

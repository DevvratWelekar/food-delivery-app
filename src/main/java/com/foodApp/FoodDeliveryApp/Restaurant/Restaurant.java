package com.foodApp.FoodDeliveryApp.Delivery;

import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    private String restaurantName;

    public void acceptOrder(){
        System.out.println("Order Accepted by : "+restaurantName);
    }
}

package com.foodApp.FoodDeliveryApp.Restaurant;

public class Order {
    private int orderId;

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public void placeOrder() {
        System.out.println("Order Placed: " + orderId);
    }
}

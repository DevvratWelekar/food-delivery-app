package com.foodApp.FoodDeliveryApp.Order;

public class DeliveryPartner {
    private String partnerName;
    private String partnerEmail;
    private String partnerPhone;

    public DeliveryPartner(String partnerName, String partnerEmail, String partnerPhone) {
        this.partnerName = partnerName;
        this.partnerEmail = partnerEmail;
        this.partnerPhone = partnerPhone;
    }
    public void deliverOrder() {
        System.out.println("Delivery Partner" + partnerName + "is delivering");
    }
}

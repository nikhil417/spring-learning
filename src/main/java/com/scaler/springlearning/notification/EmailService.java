package com.scaler.springlearning.notification;

public class EmailService implements NotificationService{

    public EmailService() {
        System.out.println("EmailService created: " + this);
    }
    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }
}

package com.scaler.springlearning.config;

import com.scaler.springlearning.notification.EmailService;
import com.scaler.springlearning.notification.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class NotificationConfig {

    @Bean
    @Scope("prototype")
    public NotificationService emailService() {
        return new EmailService();
    }
}

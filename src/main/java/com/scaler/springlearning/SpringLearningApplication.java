package com.scaler.springlearning;

import com.scaler.springlearning.notification.NotificationService;
import com.scaler.springlearning.order.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearningApplication implements CommandLineRunner {

	private final OrderService orderService;
	private final ApplicationContext applicationContext;

    public SpringLearningApplication(OrderService orderService, ApplicationContext applicationContext) {
        this.orderService = orderService;
		this.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
		SpringApplication.run(SpringLearningApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		orderService.placeOrder();
		orderService.placeOrder();
		NotificationService notificationService1 = applicationContext.getBean(NotificationService.class);
		NotificationService notificationService2 = applicationContext.getBean(NotificationService.class);
		System.out.println(notificationService1 == notificationService2);

	}
}

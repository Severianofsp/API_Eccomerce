package com.katalid.ecommerce.checkout;

import com.katalid.ecommerce.checkout.streaming.CheckoutCreatedSource;
import com.katalid.ecommerce.checkout.streaming.PaymentPaidSink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(value = {CheckoutCreatedSource.class, PaymentPaidSink.class})
public class CheckoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckoutApplication.class, args);
	}

}

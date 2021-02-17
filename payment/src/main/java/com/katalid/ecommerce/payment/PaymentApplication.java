package com.katalid.ecommerce.payment;

import com.katalid.ecommerce.payment.streaming.CheckoutProcessor;
import com.katalid.ecommerce.payment.streaming.PaymentPaidSink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(value = {CheckoutProcessor.class, PaymentPaidSink.class})
public class PaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}

}

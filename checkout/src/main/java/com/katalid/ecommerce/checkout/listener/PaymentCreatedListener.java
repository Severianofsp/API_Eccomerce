package com.katalid.ecommerce.checkout.listener;

import com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent;
import com.katalid.ecommerce.checkout.entity.CheckoutEntity;
import com.katalid.ecommerce.checkout.repository.CheckoutRepository;
import com.katalid.ecommerce.checkout.resource.CheckoutReponse;
import com.katalid.ecommerce.checkout.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class PaymentCreatedListener {

    private CheckoutRepository repository;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent event ){
        final CheckoutEntity checkoutEntity = repository.findByCode(event.getCheckoutCode().toString()).orElseThrow();
        checkoutEntity.setStatus(CheckoutEntity.Status.APROVED);
        repository.save(checkoutEntity);
        event.getCheckoutCode();
    }
}

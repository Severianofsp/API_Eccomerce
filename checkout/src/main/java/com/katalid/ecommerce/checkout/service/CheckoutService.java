package com.katalid.ecommerce.checkout.service;

import com.katalid.ecommerce.checkout.entity.CheckoutEntity;
import com.katalid.ecommerce.checkout.resource.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> createCheckout(CheckoutRequest checkoutRequest);
}

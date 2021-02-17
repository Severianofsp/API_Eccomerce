package com.katalid.ecommerce.checkout.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class CheckoutReponse implements Serializable {


    private String code;
}

package com.parthcodes.store;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal");
        System.out.println("Payment processed successfully: " + amount);
    }

}

package com.parthcodes.store;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    // public OrderService() { //used for autowired error example
    // }

    // use a constructor(+ encapsulation setter) for dependency injection
    // @Autowired  // used when multiple constructors are in play
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }

    // setter method for Dependency injection
    // public void setPaymentService(PaymentService paymentService) {
    // this.paymentService = paymentService;
    // }
}

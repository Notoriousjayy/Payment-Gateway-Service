package com.example.PaymentGatewayService;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentResponse processPayment(PaymentRequest request) {
        // Implement payment processing logic here
        // Call the actual payment gateway API, perform validation, etc.
        // For simplicity, let's assume the payment is always successful.
        PaymentResponse response = new PaymentResponse();
        response.setStatus("success");
        response.setMessage("Payment processed successfully");
        return response;
    }
}

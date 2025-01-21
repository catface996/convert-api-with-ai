package com.catface996.ai.api.impl.payment.exception;

public class PaymentException extends RuntimeException {
    
    public PaymentException(String message) {
        super(message);
    }
    
    public PaymentException(String message, Throwable cause) {
        super(message, cause);
    }
} 
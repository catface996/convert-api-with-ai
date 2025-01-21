package com.catface996.ai.api.impl.payment.model;

import lombok.Data;

@Data
public class PaymentResponse {
    private String code;
    private String message;
    private PaymentData data;
    
    @Data
    public static class PaymentData {
        private String orderId;
        private String paymentUrl;
        private String status;
    }
} 
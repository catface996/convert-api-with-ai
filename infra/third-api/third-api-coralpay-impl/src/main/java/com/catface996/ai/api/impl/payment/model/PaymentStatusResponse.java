package com.catface996.ai.api.impl.payment.model;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class PaymentStatusResponse {
    private String code;
    private String message;
    private StatusData data;
    
    @Data
    public static class StatusData {
        private String orderId;
        private String status;
        private BigDecimal amount;
        private String currency;
        private String paymentTime;
    }
} 
package com.catface996.ai.api.impl.payment.model;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class PaymentRequest {
    private String merchantId;
    private String orderId;
    private BigDecimal amount;
    private String currency;
    private String notifyUrl;
    private String returnUrl;
    private String productDesc;
} 
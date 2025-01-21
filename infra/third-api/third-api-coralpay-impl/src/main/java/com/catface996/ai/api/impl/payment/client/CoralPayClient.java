package com.catface996.ai.api.impl.payment.client;

import com.catface996.ai.api.impl.payment.exception.PaymentException;
import com.catface996.ai.api.impl.payment.model.PaymentRequest;
import com.catface996.ai.api.impl.payment.model.PaymentResponse;
import com.catface996.ai.api.impl.payment.model.PaymentStatusResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class CoralPayClient {

    private static final String CREATE_PAYMENT_PATH = "/api/v1/payment/create";
    private static final String QUERY_PAYMENT_PATH = "/api/v1/payment/query";

    @Value("${coral.pay.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;

    public CoralPayClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * 创建支付订单
     */
    public PaymentResponse createPayment(PaymentRequest request) {
        String url = apiUrl + CREATE_PAYMENT_PATH;

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<PaymentRequest> entity = new HttpEntity<>(request, headers);

        try {
            return restTemplate.postForObject(url, entity, PaymentResponse.class);
        } catch (Exception e) {
            log.error("Create payment failed", e);
            throw new PaymentException("支付创建失败", e);
        }
    }

    /**
     * 查询支付订单状态
     */
    public PaymentStatusResponse queryPaymentStatus(String orderId) {
        String url = apiUrl + QUERY_PAYMENT_PATH + "?orderId=" + orderId;

        try {
            return restTemplate.getForObject(url, PaymentStatusResponse.class);
        } catch (Exception e) {
            log.error("Query payment status failed", e);
            throw new PaymentException("支付状态查询失败", e);
        }
    }
} 
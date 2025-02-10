package com.catface996.ai.api.weather;

import com.alibaba.fastjson.JSONObject;
import com.catface996.ai.api.weather.model.WeatherApiModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Service
public class WeatherApiServiceImpl implements WeatherApiService {

    private AtomicInteger count = new AtomicInteger(0);

    private final RestTemplate restTemplate;

    private final String baseUrl = "https://t1go2v7zde.execute-api.ap-northeast-2.amazonaws.com";
    private final String stage = "/dev";
    private final String url = "/weather";
    private final String gaode = "/gaode";
    private final String hefeng = "/hefeng";


    public WeatherApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * 通过调用AWS的API-Gateway来
     *
     * @param city 城市名称,例如:"北京"、"上海"、"广州"等
     * @return
     */

    @Override
    public WeatherApiModel queryWeatherByCity(String city) {
        String entireUrl = buildEntireUrl();
        JSONObject body = new JSONObject();
        body.put("city", city);
        try {
            ResponseEntity<WeatherApiModel> entity = restTemplate.postForEntity(new URI(entireUrl), body, WeatherApiModel.class);
            return entity.getBody();
        } catch (Throwable t) {
            log.error("query weather by city error. city:{}, entireUrl:{}", city, entireUrl, t);
        }
        return WeatherApiModel.error();
    }

    private String buildEntireUrl() {
        int value = count.incrementAndGet();
        int remainder = value % 2;
        switch (remainder) {
            case 0:
                return baseUrl + stage + url + gaode;
            case 1:
                return baseUrl + stage + url + hefeng;
        }
        return baseUrl + stage + url + gaode;
    }


}

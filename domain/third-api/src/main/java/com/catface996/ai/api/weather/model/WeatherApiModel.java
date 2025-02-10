package com.catface996.ai.api.weather.model;

/**
 * 天气信息模型
 * 用于封装天气相关的数据,包括城市和气温信息
 *
 * @author catface996
 * @date 2025/02/07
 */
public class WeatherApiModel {

    /**
     * 城市名称
     */
    private String city;

    /**
     * 气温(摄氏度)
     */
    private Double temperature;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}

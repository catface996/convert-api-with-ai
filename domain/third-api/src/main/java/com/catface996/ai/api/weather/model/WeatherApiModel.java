package com.catface996.ai.api.weather.model;

import lombok.Data;

/**
 * 天气信息模型
 * 用于封装天气相关的数据,包括城市和气温信息
 *
 * @author catface996
 * @date 2025/02/07
 */
@Data
public class WeatherApiModel {

    /**
     * 城市名称
     */
    private String city;

    /**
     * 气温(摄氏度)
     */
    private Double temperature;

    public static WeatherApiModel error(){
        WeatherApiModel model = new WeatherApiModel();
        model.setCity("error");
        model.setTemperature(0.0);
        return model;
    }

}

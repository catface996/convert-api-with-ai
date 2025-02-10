package com.catface996.ai.traffic.http.weather.response;

import com.catface996.ai.domain.business.weather.model.WeatherDmModel;
import lombok.Data;

@Data
public class WeatherResponse {

    private String city;

    private String temperature;

    public static WeatherResponse convert(WeatherDmModel dmModel) {
        if (dmModel == null) {
            return null;
        }
        WeatherResponse response = new WeatherResponse();
        response.setCity(dmModel.getCity());
        response.setTemperature(dmModel.getTemperature());
        return response;
    }
}

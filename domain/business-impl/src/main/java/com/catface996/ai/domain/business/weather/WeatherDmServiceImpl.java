package com.catface996.ai.domain.business.weather;

import com.catface996.ai.api.weather.WeatherApiService;
import com.catface996.ai.api.weather.model.WeatherApiModel;
import com.catface996.ai.domain.business.weather.model.WeatherDmModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WeatherDmServiceImpl implements WeatherDmService{

    private final WeatherApiService weatherApiService;

    public WeatherDmServiceImpl(WeatherApiService weatherApiService) {
        this.weatherApiService = weatherApiService;
    }

    @Override
    public WeatherDmModel getWeatherByCity(String city) {
        WeatherApiModel apiModel = weatherApiService.queryWeatherByCity(city);
        if (apiModel != null) {
            return convert(apiModel);
        }
        return null;
    }

    private  WeatherDmModel convert(WeatherApiModel apiModel) {
        WeatherDmModel dmModel = new WeatherDmModel();
        dmModel.setCity(apiModel.getCity());
        dmModel.setTemperature(apiModel.getTemperature().toString());
        return dmModel;
    }

}

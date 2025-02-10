package com.catface996.ai.api.weather;

import com.catface996.ai.api.weather.model.WeatherApiModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WeatherApiServiceImpl implements WeatherApiService  {

    @Override
    public WeatherApiModel queryWeatherByCity(String city) {
        return null;
    }



}

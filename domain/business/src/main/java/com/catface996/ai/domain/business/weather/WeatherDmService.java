package com.catface996.ai.domain.business.weather;

import com.catface996.ai.domain.business.weather.model.WeatherDmModel;

public interface WeatherDmService {

    WeatherDmModel getWeatherByCity(String city);

}

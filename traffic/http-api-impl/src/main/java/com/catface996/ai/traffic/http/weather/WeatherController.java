package com.catface996.ai.traffic.http.weather;

import com.catface996.ai.domain.business.weather.WeatherDmService;
import com.catface996.ai.domain.business.weather.model.WeatherDmModel;
import com.catface996.ai.traffic.http.weather.request.WeatherRequest;
import com.catface996.ai.traffic.http.weather.response.WeatherResponse;
import com.catface996.ai.traffic.model.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class WeatherController {

    private final WeatherDmService weatherDmService;

    public WeatherController(WeatherDmService weatherDmService) {
        this.weatherDmService = weatherDmService;
    }

    @PostMapping(value = "/getWeather")
    JsonResult<WeatherResponse> getWeather(@RequestBody WeatherRequest request) {

        WeatherDmModel dmModel = weatherDmService.getWeatherByCity(request.getCity());

        WeatherResponse response =WeatherResponse.convert(dmModel);

        return JsonResult.success(response);
    }
}

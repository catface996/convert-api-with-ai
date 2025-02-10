package com.catface996.ai.api.weather;

import com.catface996.ai.api.weather.model.WeatherApiModel;

/**
 * 天气服务接口
 * 提供天气相关的查询服务
 *
 * @author catface996
 * @date 2025/02/07
 */
public interface WeatherApiService {

    /**
     * 根据城市名称查询天气信息
     *
     * @param city 城市名称,例如:"北京"、"上海"、"广州"等
     * @return 返回包含城市名称和气温信息的WeatherModel对象
     */
    WeatherApiModel queryWeatherByCity(String city);

}

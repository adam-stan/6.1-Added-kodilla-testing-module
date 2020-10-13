package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage(){
        double addedTemperatures = 0;
        for (Map.Entry<String, Double> entry: temperatures.getTemperatures().entrySet()){
            Double temperatureValue = entry.getValue();
            addedTemperatures += temperatureValue;
        }
        double result = addedTemperatures / temperatures.getTemperatures().size();
        return result;
    }

    public double calculateMedian(){
        ArrayList<Double> TemperatureList = new ArrayList<Double>();
        for (Map.Entry<String, Double> entry: temperatures.getTemperatures().entrySet()) {
            Double temperatureValue = entry.getValue();
            TemperatureList.add(temperatureValue);
        }
        Collections.sort(TemperatureList);
        double median;
        if (TemperatureList.size() % 2 == 0) {
            median = (TemperatureList.get(TemperatureList.size() / 2) + TemperatureList.get(TemperatureList.size() / 2 - 1)) / 2;
        } else {
            median = TemperatureList.get(TemperatureList.size() / 2);
        }
        return median;
    }
}

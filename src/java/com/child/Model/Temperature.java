package com.child.Model;

/**
 * 
 * @author Barry Gray Kapelembe 
 */
public class Temperature {
    private double temperatureReading;
    

    public double getTemperatureReading() {
        return temperatureReading;
    }

    public boolean setTemperatureReading(double temperatureReading) {
        boolean set =false;
        if (temperatureReading >= 30 && temperatureReading <= 48){
            this.temperatureReading = temperatureReading;
            set = true;          
        }
        return set;
    }
    

}

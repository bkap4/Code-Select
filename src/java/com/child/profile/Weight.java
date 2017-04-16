package com.child.profile;

/**
 * 
 * @author Barry Gray Kapelembe 
 */
public class Weight {
    private double weightReading;

    public double getWeightReading() {
        return weightReading;
    }

    public boolean setWeightReading(double weightReading) {
        boolean set = false;
        if (weightReading > 0 ){
            this.weightReading = weightReading;
            set = true;
        }
        return set;   
    }
    
    

}

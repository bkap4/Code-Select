package com.child.profile;

import com.profile.models.Person;

/**
 * 
 * @author Barry Gray Kapelembe 
 */
public class Child extends Person {
    private String destingushingMarks;
    private Temperature temp;
    private Meals meal;
    private Weight weight;
    private Nappies nappy;
    private ChildMedicalHistory medicalHistory;

    public ChildMedicalHistory getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(ChildMedicalHistory medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getDestingushingMarks() {
        return destingushingMarks;
    }

    public void setDestingushingMarks(String destingushingMarks) {
        this.destingushingMarks = destingushingMarks;
    }

    public Temperature getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp.setTemperatureReading(temp);
    }

    public Meals getMeal() {
        return meal;
    }

    public void setMeal(String mealDes,String amountEaten,String comment) {
        this.meal.setMealDescription(mealDes);
        this.meal.setAmountEaten(amountEaten);
        this.meal.setCommentOnEating(comment);
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight.setWeightReading(weight);
    }

    public Nappies getNappy() {
        return nappy;
    }

    public void setNappy(boolean wet, boolean dry) {
        this.nappy.setConditionDry(dry);
        this.nappy.setConditionWet(wet);
    }  

    @Override
    public int getAge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

package com.child.models;

import java.util.ArrayList;

/**
 * 
 * @author Barry Gray Kapelembe 
 */
public class ChildMedicalHistory {
    private ArrayList <String> doctersName = new ArrayList <String>();
    private ArrayList <String>  illnessDetected= new ArrayList <String>() ;
    private ArrayList <String>  cause = new ArrayList <String>();
    private ArrayList <String> medicines = new ArrayList <String>();
    private ArrayList <String> allergies = new ArrayList <String>();
    private ArrayList <String> specialTreatmeants = new ArrayList <String>();
    private ArrayList <String> clincVisited = new ArrayList <String>();

    public ArrayList<String> getDoctersName() {
        return doctersName;
    }

    public void setDoctersName(ArrayList<String> doctersName) {
        this.doctersName = doctersName;
    }

    public ArrayList<String> getIllnessDetected() {
        return illnessDetected;
    }

    public void setIllnessDetected(String illnessDetected) {
        this.illnessDetected.add(illnessDetected);
    }

    public ArrayList<String> getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause.add(cause);
    }

    public ArrayList<String> getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines.add(medicines);
    }

    public ArrayList<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies.add(allergies);
    }

    public ArrayList<String> getSpecialTreatmeants() {
        return specialTreatmeants;
    }

    public void setSpecialTreatmeants(String specialTreatmeants) {
        this.specialTreatmeants.add(specialTreatmeants);
    }

    public ArrayList<String> getClincVisited() {
        return clincVisited;
    }

    public void setClincVisited(String clincVisited) {
        this.clincVisited.add(clincVisited);
    }
    
    
    
    
    
    
    

}

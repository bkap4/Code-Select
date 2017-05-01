package com.models;

/**
 * 
 * @author Barry Gray Kapelembe 
 */
public class OthantileStaff {
    private int staffID;
    private String firstname;
    private String lastname;

    public OthantileStaff(int staffID, String firstname, String lastname) {
        this.staffID = staffID;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public OthantileStaff(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    

}

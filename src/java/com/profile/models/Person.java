package com.profile.models;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Barry Gray Kapelembe
 */
@ManagedBean(name = "Person", eager = true)
@SessionScoped

public abstract class Person {

    private String firstname;
    private String lastname;
    private char gender;
    private String phoneNumbe;
    private String address;
    private String placeOfBirth;
    private Date dateOfBirth;
    private String emailAdress;

    public abstract String getFirstname();

    public abstract boolean setFirstname(String firstname);

    public abstract String getLastname();

    public abstract boolean setLastname(String lastname);

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhoneNumbe() {
        return phoneNumbe;
    }

    public void setPhoneNumbe(String phoneNumbe) {
        this.phoneNumbe = phoneNumbe;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

}

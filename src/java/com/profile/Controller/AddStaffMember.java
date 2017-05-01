package com.profile.Controller;

import com.db.connection.DBConnection;
import com.models.OthantileStaff;
import com.models.Staff;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



/**
 * 
 * @author Barry Gray Kapelembe 
 */
@ManagedBean(name="AddStaffMember")
@RequestScoped
public class AddStaffMember implements Serializable {
    private int staffID;
    private String firstname;
    private String lastname;
    private char gender;
    private String phoneNumber;
    private String address;
    private String placeOfBirth;
    private SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
    private Date dateOfBirth;
    private String emailAddress;

    public SimpleDateFormat getSm() {
        return sm;
    }

    public void setSm(SimpleDateFormat sm) {
        this.sm = sm;
    }

    public AddStaffMember() {
   
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    
    public void addStaff() throws ClassNotFoundException{
        //    public Staff(String firstname, String lastname, char gender, String phoneNumber, String address, String placeOfBirth, Date dateOfBirth, String emailAddress) {
/*    private int staffID;
    private String firstname;
    private String lastname;
    private char gender;
    private String phoneNumber;
    private String address;
    private String placeOfBirth;
    private Date dateOfBirth;
    private String emailAddress;*/


        Staff staff = new Staff(firstname,lastname,gender,address,placeOfBirth,dateOfBirth,emailAddress);
        System.out.println("This is the address "+ address);
        //OthantileStaff staff = new OthantileStaff (firstName,lastName);
        DBConnection connect = new DBConnection();
        connect.addUser(staff);
    }
}

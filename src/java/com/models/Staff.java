
package com.models;
/**
 *
 * @author efsan1
 */
import com.models.Person;
import com.profile.Controller.Authentication;
import com.profile.Controller.Authentication;
import com.profile.Controller.Message;
import com.profile.Controller.Message;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

public class Staff extends Person{
    private int staffID;

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }
    private Message massage;
    private Authentication authcateDetails;

    public Staff(int staffID,String firstname, String lastname, char gender, String address, String placeOfBirth, Date dateOfBirth, String emailAddress) {
        super(firstname, lastname, gender, address, placeOfBirth, dateOfBirth, emailAddress);
        this.staffID=staffID;
        
    }
     public Staff(String firstname, String lastname, char gender, String address, String placeOfBirth, Date dateOfBirth, String emailAddress) {
        super(firstname, lastname, gender, address, placeOfBirth, dateOfBirth, emailAddress);
       
        
    }
     public Staff(String firstname, String lastname, char gender, String phoneNumber, String address, String placeOfBirth, Date dateOfBirth, String emailAddress) {
        super(firstname, lastname, gender, phoneNumber, address, placeOfBirth, dateOfBirth, emailAddress);
        
    }

   
    
    
    public Message getMassage() {
        return massage;
    }

    public Authentication getAuthcateDetails() {
        return authcateDetails;
    }
    

    public void setMassage(Message massage) {
        this.massage = massage;
    }

    public void setAuthcateDetails(Authentication authcateDetails) {
        this.authcateDetails = authcateDetails;
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getAge() {
        return 2;
    }
    
    
}


package com.profile.models;
/**
 *
 * @author efsan1
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name= "Staff", eager= true)
@SessionScoped

public class Staff extends Person{
    
    private Message massage;
    private Authentication authcateDetails;
    
    
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

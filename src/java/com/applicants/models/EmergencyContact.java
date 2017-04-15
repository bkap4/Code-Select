

package com.applicants.models;

import com.profile.models.Person;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author efsan1
 */
@ManagedBean (name= "EmergencyContact", eager= true)
@SessionScoped

public class EmergencyContact extends Person {
    
    private String relationship;

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
    
    @Override
    public int getAge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

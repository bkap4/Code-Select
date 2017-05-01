package com.profile.Controller;


import com.db.connection.DBConnection;
import com.models.OthantileStaff;
import com.models.Staff;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * 
 * @author Barry Gray Kapelembe 
 */
@ManagedBean (name="OthantileStaffList",eager=true)
@SessionScoped
////staffID, firstName, LastName `onthatile children's ministries`.`onthantilestaff`
public class UsersController implements Serializable {
    private List <Staff> users = new ArrayList <Staff>();
    
    public UsersController() {
       
    }
   
    

    public List<Staff> getUsers() {
        users = new DBConnection().getUsers();
        return users;
    }
    

}

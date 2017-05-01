package com.navigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * 
 * @author Barry Gray Kapelembe 
 */
@ManagedBean(name="navigate", eager=true)
@RequestScoped
public class PageNavigation {
     
    public String goToAddStaff (){
        return "page";
    }

}

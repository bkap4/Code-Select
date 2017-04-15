
package com.profile.models;

/**
 *
 * @author efsan1
 */
public interface Role {
    
    boolean setRoleName(String name);
    
    String getRoleName();
    
    int setAccessLevel();
    
    int getAccessLevel();
}

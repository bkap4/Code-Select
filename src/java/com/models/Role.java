
package com.models;

/**
 *
 * @author efsan1
 */
public interface Role {
    
    boolean setRoleName(String name);
    
    String getRoleName();
    
    boolean setAccessLevel(int acess);
    
    int getAccessLevel();
}

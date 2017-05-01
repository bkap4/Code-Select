package com.db.connection;

/**
 * 
 * @author Barry Gray Kapelembe 
 */
public class ChildProfileConnection extends DatabaseConnection{

    public ChildProfileConnection() {
        super();
    }
     
    public void getconnection () throws ClassNotFoundException{
        super.getConnection();
    }
    

    @Override
    boolean recordValidator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

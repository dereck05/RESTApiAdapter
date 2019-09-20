/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author derec
 */
public class DBAdapter implements IEmpleado{
    public DBAdapter(){}{}
    @Override
    public String consultar(String name){
        DBConnector db = new DBConnector();
        String res = db.consultar(name);
        return res;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.ws.rs.core.MediaType;
import org.json.JSONObject;

/**
 *
 * @author derec
 */
public class RESTAdapter implements IEmpleado {
    public RESTAdapter(){};
    @Override
    public String consultar(String name){
        RESTClient cl = new RESTClient();
        String json = (cl.find_JSON(MediaType.APPLICATION_JSON.getClass(),name));
        return json;
    }
    
}

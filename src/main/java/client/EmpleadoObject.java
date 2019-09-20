/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;


public class EmpleadoObject {
    IEmpleado algorithm;
    
    public EmpleadoObject(){};
    
    public void consultar(String nombre,String tipoConsulta){
        
        if(tipoConsulta.equals("REST")){
            algorithm= new RESTAdapter();
            String res = algorithm.consultar(nombre);
            System.out.println("REST-API Result\n\n "+res);
        }
        if(tipoConsulta.equals("database")){
            algorithm= new DBAdapter();
            String res = algorithm.consultar(nombre);
            System.out.println(res);
        }
    }
}

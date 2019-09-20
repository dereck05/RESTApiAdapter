
package client;

public class Client {
    public static void main(String[] args){
        EmpleadoObject obj = new EmpleadoObject();
        obj.consultar("Juan", "database");
        obj.consultar("Luis", "REST");
    }
}

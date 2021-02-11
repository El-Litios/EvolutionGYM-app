/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepeatClasses;

/**
 *
 * @author Mark-
 */
public class Client2 extends User2{
    private String rut_client;
    private String name_client;

    public Client2() {
    }

    public Client2(String name_client, String name_pers, String desc_type, String desc_model) {
        super(name_pers, desc_type, desc_model);
        this.name_client = name_client;
    }

    public String getRut_client() {
        return rut_client;
    }

    public void setRut_client(String rut_client) {
        this.rut_client = rut_client;
    }

    public String getName_client() {
        return name_client;
    }

    public void setName_client(String name_client) {
        this.name_client = name_client;
    }

    
    
}

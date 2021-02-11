/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Mark-
 */
public class Client {
    private int cod_client;
    private String rut_client;
    private String name_client;
    private String App_client;
    private String Apm_client;

    public Client() {
    }

    public Client(String rut_client, String name_client) {
        this.rut_client = rut_client;
        this.name_client = name_client;
    }

    public Client(int cod_client, String rut_client) {
        this.cod_client = cod_client;
        this.rut_client = rut_client;
    }

    public Client(int cod_client, String rut_client, String name_client, String App_client, String Apm_client) {
        this.cod_client = cod_client;
        this.rut_client = rut_client;
        this.name_client = name_client;
        this.App_client = App_client;
        this.Apm_client = Apm_client;
    }

    public int getCod_client() {
        return cod_client;
    }

    public void setCod_client(int cod_client) {
        this.cod_client = cod_client;
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

    public String getApp_client() {
        return App_client;
    }

    public void setApp_client(String App_client) {
        this.App_client = App_client;
    }

    public String getApm_client() {
        return Apm_client;
    }

    public void setApm_client(String Apm_client) {
        this.Apm_client = Apm_client;
    }
    
    @Override
    public String toString(){
    return rut_client;
    }
}

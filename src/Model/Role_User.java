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
public class Role_User {
    private int cod_role;
    private String desc_role;

    public Role_User() {
    }

    public Role_User(int cod_role, String desc_role) {
        this.cod_role = cod_role;
        this.desc_role = desc_role;
    }

    public Role_User(String desc_role) {
        this.desc_role = desc_role;
    }

    
    public int getCod_role() {
        return cod_role;
    }

    public void setCod_role(int cod_role) {
        this.cod_role = cod_role;
    }

    public String getDesc_role() {
        return desc_role;
    }

    public void setDesc_role(String desc_role) {
        this.desc_role = desc_role;
    }
    
    @Override
    public String toString(){
        return desc_role;
    }
}

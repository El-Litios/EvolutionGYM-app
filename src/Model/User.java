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
public class User extends Role_User{
    private int cod_user;
    private String name_user;
    private String pass_user;
    private String name_pers;
    private String ap_user;
    private String am_user;

    public User() {
    }

    public User(int cod_user, String name_user, String name_pers, String desc_role) {
        super(desc_role);
        this.cod_user = cod_user;
        this.name_user = name_user;
        this.name_pers = name_pers;
    }

    public User(int cod_user, String name_user, String desc_role) {
        super(desc_role);
        this.cod_user = cod_user;
        this.name_user = name_user;
    }
    

    public User(String name_user, String pass_user, String name_pers, String ap_user, String am_user, String desc_role) {
        super(desc_role);
        this.name_user = name_user;
        this.pass_user = pass_user;
        this.name_pers = name_pers;
        this.ap_user = ap_user;
        this.am_user = am_user;
    }

    public User(String name_pers) {
        this.name_pers = name_pers;
    }

    public int getCod_user() {
        return cod_user;
    }

    public void setCod_user(int cod_user) {
        this.cod_user = cod_user;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getPass_user() {
        return pass_user;
    }

    public void setPass_user(String pass_user) {
        this.pass_user = pass_user;
    }

    public String getName_pers() {
        return name_pers;
    }

    public void setName_pers(String name_pers) {
        this.name_pers = name_pers;
    }

    public String getAp_user() {
        return ap_user;
    }

    public void setAp_user(String ap_user) {
        this.ap_user = ap_user;
    }

    public String getAm_user() {
        return am_user;
    }

    public void setAm_user(String am_user) {
        this.am_user = am_user;
    }
    
    
}

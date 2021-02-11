/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.User;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author Mark-
 */
public class C_User extends User{
    C_Conecction con= new C_Conecction();
    
    public boolean Login(String nu, String pu, String rn){
        try {
            con.conectar();
            PreparedStatement sql=con.Estado().prepareStatement(
                    "SELECT nom_user, pass_user, desc_role FROM user "
                    + "INNER JOIN role ON (user.cod_role = role.cod_role) "
                    + "WHERE nom_user='"+nu+"' AND pass_user='"+pu+"' AND desc_role='"+rn+"' "
            );
            ResultSet res = sql.executeQuery();
            while (res.next()) {                
                this.setName_user("nom_user");
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error Login "+"\n"+e);
        }finally{
        con.Desconectar();
        }
        return false;

    }
    
    
}

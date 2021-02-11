/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Client;
import Model.Role_User;
import Model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mark-
 */
public class C_Workers {
    
    C_Conecction con = new C_Conecction();
    
    public List ListaTrabajadores(String dato){
    List<User> lista = new ArrayList<>();
        try {
            con.conectar();
            PreparedStatement sql = con.Estado().prepareStatement("SELECT cod_user, nom_user,concat(nom_pers,' ',ap_user,' ',am_user) as nom_pers, desc_role FROM user "
                    + "INNER JOIN role "
                    + "ON (role.cod_role = user.cod_role) "
                    + "WHERE nom_user LIKE '%"+dato+"%' OR nom_pers LIKE '%"+dato+"%'");
            ResultSet res = sql.executeQuery();
            while (res.next()) {                
                lista.add(new User(res.getInt("cod_user"), res.getString("nom_user"), res.getString("nom_pers"), res.getString("desc_role")));
            }
        } catch (SQLException e) {
            System.out.println("Error listar Trabajadores: "+"\n"+e);
        }finally{
        con.Desconectar();
        }
        return lista;
    }
    
    public void AgregarTrabajadores(String nu, String pass, String nom, String ap, String am, int codr){
        try {
            con.conectar();
            PreparedStatement sql = con.Estado().prepareStatement("INSERT INTO user (nom_user, pass_user, nom_pers, ap_user, am_user, cod_role) VALUES "
                    + "('"+nu+"','"+pass+"','"+nom+"','"+ap+"','"+am+"','"+codr+"')");
            sql.execute();
        } catch (SQLException e) {
            System.out.println("Error Agregar Trabajadores"+"\n"+e);
        }finally{
        con.Desconectar();
        }
    }
    
    public void EditarTrabajadores(int cod, String nu, String nom, String ap, String am, int codr){
        try {
            con.conectar();
            PreparedStatement sql = con.Estado().prepareStatement("UPDATE user SET "
                    + "nom_user='"+nu+"', nom_pers='"+nom+"', ap_user='"+ap+"', am_user='"+am+"' "
                    + "WHERE cod_user = '"+cod+"'");
            sql.execute();
        } catch (SQLException e) {
            System.out.println("Error Editar Trabajadores"+"\n"+e);
        }finally{
        con.Desconectar();
        }
    }
    
    public void EliminarTrabajadores(int cod){
        try {
            con.conectar();
            PreparedStatement sql = con.Estado().prepareStatement("DELETE FROM user WHERE cod_user='"+cod+"'");
            sql.execute();
        } catch (SQLException e) {
            System.out.println("Error eliminar Trabajadores"+"\n"+e);
        }finally{
        con.Desconectar();
        }
    }
    
    public List CB_Rol(){
        List<Role_User> lista = new ArrayList<>();
        try {
            con.conectar();
            PreparedStatement sql = con.Estado().prepareStatement("SELECT * FROM role");
            ResultSet rs = sql.executeQuery();
            while(rs.next()){
                lista.add(new Role_User(rs.getInt("cod_role"), rs.getString("desc_role")));
            }
        } catch (SQLException e) {
            System.out.println("Error ComboBox de Roles "+"\n"+e);
        }finally{
        con.Desconectar();
        }
        return lista;
    }
}

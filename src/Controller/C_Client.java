/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Client;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mark-
 */
public class C_Client {
    C_Conecction con = new C_Conecction();
    
    public List ListaClientes(String dato){
    List<Client> lista = new ArrayList<>();
        try {
            con.conectar();
            PreparedStatement sql = con.Estado().prepareStatement("SELECT * FROM client "
                    + "WHERE rut_client LIKE '%"+dato+"%' OR nom_client LIKE '%"+dato+"%'");
            ResultSet res = sql.executeQuery();
            while (res.next()) {                
                lista.add(new Client(res.getInt("cod_client"), 
                        res.getString("rut_client"), 
                        res.getString("nom_client"), 
                        res.getString("ap_client"), 
                        res.getString("am_client")));
            }
        } catch (SQLException e) {
            System.out.println("Error listar Clientes: "+"\n"+e);
        }finally{
        con.Desconectar();
        }
        return lista;
    }
    
    public void EliminarC(int cod){
        try {
            con.conectar();
            PreparedStatement sql = con.Estado().prepareStatement("DELETE FROM client WHERE cod_client='"+cod+"'");
            sql.execute();
        } catch (SQLException e) {
            System.out.println("Error eliminar Cliente: "+"\n"+e);
        }finally{
        con.Desconectar();
        }
    }
    
    public void ModificarC(int cod, String rut, String n, String ap, String am){
        try {
            con.conectar();
            PreparedStatement sql = con.Estado().prepareStatement("UPDATE client SET "
                    + "rut_client='"+rut+"', nom_client='"+n+"', ap_client='"+ap+"', am_client='"+am+"' "
                    + "WHERE cod_client='"+cod+"'");
            sql.execute();
        } catch (SQLException e) {
            System.out.println("Error editar cliente: "+"\n"+e);
        }finally{
        con.Desconectar();
        }
    }
    
    public void AgregarC(String rut, String n, String ap, String am){
        try {
            con.conectar();
            PreparedStatement sql = con.Estado().prepareStatement("INSERT INTO client (rut_client,nom_client,ap_client,am_client) VALUES "
                    + "('"+rut+"','"+n+"','"+ap+"','"+am+"')");
            sql.execute();
        } catch (SQLException e) {
            System.out.println("Error agregar cliente: "+"\n"+e);
        }finally{
        con.Desconectar();
        }
    }
}

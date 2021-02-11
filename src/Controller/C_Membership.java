package Controller;

import Model.Client;
import Model.Model_Payment;
import Model.Plan;
import Model.Type_plan;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.ArrayList;
import java.util.List;

public class C_Membership {
    C_Conecction con= new C_Conecction();
    
    public List ListMembership(String dato){
        List<Plan> lista=new ArrayList<>();
        try {
            con.conectar();
            PreparedStatement sql=con.Estado().prepareStatement("SELECT cod_mem, " +
            "concat(nom_pers,' ',ap_user,' ',am_user) as nom_pers, concat(nom_client,' ',ap_client,' ',am_client) as nom_client, desc_payM, desc_var, date_ini, date_end " +
            "FROM " +
            "membership " +
            "INNER JOIN user " +
            "ON (membership.cod_user = user.cod_user) " +
            "INNER JOIN paymethod " +
            "ON (membership.cod_method = paymethod.cod_payM) " +
            "INNER JOIN variant " +
            "ON (membership.cod_var = variant.cod_var) " +
            "INNER JOIN client " +
            "ON (membership.cod_client = client.cod_client) "
            + "WHERE nom_pers LIKE '%"+dato+"%' OR  nom_client LIKE '%"+dato+"%' ");
            ResultSet res=sql.executeQuery();
            while(res.next()){
                lista.add(new Plan(res.getInt("cod_mem"),
                        res.getDate("date_ini"), 
                        res.getDate("date_end"), 
                        res.getString("nom_client"), 
                        res.getString("nom_pers"), 
                        res.getString("desc_var"), 
                        res.getString("desc_payM")));
            }
        } catch (SQLException e) {
            System.out.println("Error listar Membresia: "+"\n"+e);
        }finally{
        con.Desconectar();
        }
        return lista;
    }
    
    public List C_TipoMembresia(){
    List<Type_plan> lista = new ArrayList<>();
        try {
            con.conectar();
            PreparedStatement sql=con.Estado().prepareStatement("SELECT cod_var, desc_var FROM variant");
            ResultSet res = sql.executeQuery();
            while (res.next()) {                
                lista.add(new Type_plan(res.getInt("cod_var"), res.getString("desc_var")));
            }
        } catch (SQLException e) {
            System.out.println("Error Combobx Tipo de Membresia en C_Membership: "+"\b"+e);
        }finally{
        con.Desconectar();
        }
    return lista;
    }
    
    public List C_MetodoPago(){
    List<Model_Payment> lista = new ArrayList<>();
        try {
            con.conectar();
            PreparedStatement sql=con.Estado().prepareStatement("SELECT cod_payM, desc_payM FROM paymethod");
            ResultSet res = sql.executeQuery();
            while (res.next()) {                
                lista.add(new Model_Payment(res.getInt("cod_payM"), res.getString("desc_payM")));
            }
        } catch (SQLException e) {
            System.out.println("Error Combobx Metodo de Pago en C_Membership: "+"\b"+e);
        }finally{
        con.Desconectar();
        }
    return lista;
    }
    
    public List C_Cliente(){
    List<Client> lista = new ArrayList<>();
        try {
            con.conectar();
            PreparedStatement sql=con.Estado().prepareStatement("SELECT cod_client, concat(rut_client,' - ',nom_client) as rut_client FROM client");
            ResultSet res = sql.executeQuery();
            while (res.next()) {                
                lista.add(new Client(res.getInt("cod_client"), res.getString("rut_client")));
            }
        } catch (SQLException e) {
            System.out.println("Error Combobx Cliente en C_Membership: "+"\b"+e);
        }finally{
        con.Desconectar();
        }
        return lista;
    }
    
    public void EliminarM(int cod){
        try {
            con.conectar();
            PreparedStatement sql = con.Estado().prepareStatement("DELETE FROM membership WHERE cod_mem = '"+cod+"'");
            sql.execute();
        } catch (SQLException e) {
            System.out.println("Error eliminar Membresia: "+"\n"+e);
        }finally{
        con.Desconectar();
        }
    }
    
    public void AgregarM(String u, int codc, int codm, int codv, Date ini){
        try {
            con.conectar();
            PreparedStatement sql = con.Estado().prepareStatement("INSERT INTO membership (cod_user, cod_client, cod_method, cod_var, date_ini, date_end) VALUES " +
            "( (SELECT cod_user FROM user WHERE nom_user='"+u+"')," +
            " '"+codc+"'," +
            " '"+codm+"'," +
            " '"+codv+"'," +
            " '"+ini+"'," +
            "CASE " +
            "WHEN cod_var = '1' THEN date_add(date_ini, interval 1 month) " +
            "WHEN cod_var = '2' THEN date_add(date_ini, interval 3 month) " +
            "WHEN cod_var = '3' THEN date_add(date_ini, interval 12 month) " +
            "END)");
            sql.execute();
        } catch (SQLException e) {
            System.out.println("Error agregar Membresia: "+"\n"+e);
        }finally{
        con.Desconectar();
        }
    }
    
    public void ModificarM(int cod, int codm, int codv, Date ini){
        try {
            con.conectar();
            PreparedStatement sql = con.Estado().prepareStatement("UPDATE membership SET "
            + "cod_method='"+codm+"', cod_var='"+codv+"', date_ini='"+ini+"', "
            + "date_end=CASE "
                    + "WHEN cod_var = '1' THEN date_add(date_ini, interval 1 month) "
                    + "WHEN cod_var = '2' THEN date_add(date_ini, interval 3 month) "
                    + "WHEN cod_var = '3' THEN date_add(date_ini, interval 12 month) "
                    + "END "
            + "WHERE cod_mem='"+cod+"'");
            sql.execute();
        } catch (SQLException e) {
            System.out.println("Error modificar Memebresia: "+"\n"+e);
        }finally{
        con.Desconectar();
        }
    }
}

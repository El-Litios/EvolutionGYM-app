/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mark-
 */
public class C_Conecction  {
    private String url;
    private String usuario;
    private String pass;
    private Connection conexion;

//constructores

    public C_Conecction() {
        this.url="jdbc:mysql://127.0.0.1/db_evolutiongym";
        this.usuario="root";
        this.pass="";
    }
//metodo para conectar
    public void conectar(){
    try {
        //llamar al driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion=DriverManager.getConnection(url,usuario,pass);
    } catch (ClassNotFoundException | SQLException ex) { 
        System.out.println("ERROR: "+ex);
    }
    }
     //metodo para desconectar
    public void Desconectar(){
    try {
        conexion.close();
    } catch (SQLException ex) {
        System.out.println("ERROR: "+ex);
    }
        
   }
    

    public Connection Estado(){
        return conexion;
    }
}

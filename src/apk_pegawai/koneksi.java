/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apk_pegawai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class koneksi {
     private Connection connect;
    
    private String driverName ="com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/db_pegaway";
    private String username = "root";
    private String password = "";
    
    public Connection getConnection(){
        if(connect == null) {
            try{
                Class.forName(driverName);
                System.out.println("Class Driver Ditemukan");
                connect = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connect;
    
}
}

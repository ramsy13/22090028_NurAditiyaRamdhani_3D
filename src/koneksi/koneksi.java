/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.*;

public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        }catch (ClassNotFoundException ex){
            System.out.println("Gagal Koneksi" +ex);
        }
            String url = "jdbc:mysql://localhost/pariwisata";
            try{
                koneksi =DriverManager.getConnection( url, "root","");
                System.out.println("Berhasil Koneksi Database");
            }catch (SQLException ex){
                System.out.println("Gagal Koneksi Database" +ex);
            }
            return koneksi;
    }

    public Connection bukakoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatabase;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 62813
 */
public class Update {
    
    KoneksiServer konek = new KoneksiServer();

    public void update(String Nama, String Asal, String Penyakit, String Gender) {
        
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
                
                String sql_Nama = "update identitas set Nama='" + Nama + "'where Nama='" + Nama + "'";
                String sql_Asal = "update identitas set Asal='" + Asal + "'where Nama='" + Nama + "'";
                String sql_Gender = "update identitas set Gender='" + Gender + "'where Nama='" + Nama + "'";
                
                statement.executeUpdate(sql_Nama);
                statement.executeUpdate(sql_Asal);
                statement.executeUpdate(sql_Gender);
                statement.close();
            

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}

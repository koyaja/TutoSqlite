/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.koyaja.bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M. KOMACLO
 */
public class CreatTable {

    public CreatTable() {
    }
    
    void  table(){
        String req="CREATE TABLE `user` ( `id` INT NOT NULL  , `username` VARCHAR(75) NOT NULL , `password` VARCHAR(75) NOT NULL)";
     try {
            Statement stm = ConnectionDb.ConnecrDb().createStatement();
         boolean resul=        stm.execute(req);
         if(resul){
             System.out.println("succè");
    
}
        } catch (SQLException ex) {
            System.err.println("erreur "+ex.getLocalizedMessage());
            Logger.getLogger(CreatTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void inittable(){
        String req="INSERT INTO `user` (`id`, `username`, `password`) VALUES ('1', 'admin', 'admin')";
          try {
            Statement stm = ConnectionDb.ConnecrDb().createStatement();
         boolean resul=        stm.execute(req);
         if(resul){
             System.out.println("initialisation terminé.......");
    
}
        } catch (SQLException ex) {
            System.err.println("erreur "+ex.getLocalizedMessage());
            Logger.getLogger(CreatTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void testtable(){
         ResultSet resultat = null;
String req="SELECT * FROM `user`";
        try {
            Statement statement = ConnectionDb.ConnecrDb().createStatement();
            resultat = statement.executeQuery(req);
            while (resultat.next()) {
                System.out.println("username : "+resultat.getString("username")+" Password : "+resultat.getString("password"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur dans la requet : " +e.getLocalizedMessage());
        }
    }
    
    public static void main(String[] args) {
   CreatTable c=   new CreatTable();
   c.table();
   c.inittable();
   c.testtable();
    }
}

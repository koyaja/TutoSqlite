/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.koyaja.controleur;

import bj.koyaja.bd.ConnectionDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author M. KOMACLO
 */
public class logincontroleur {
    public boolean login(String username,String password){
       boolean result=false;
        
                 ResultSet resultat = null; String mp = null;
String req="SELECT *FROM `user` where username='"+username+"'";
        try {
            Statement statement = ConnectionDb.ConnecrDb().createStatement();
            resultat = statement.executeQuery(req);
           
            while (resultat.next()) {
                mp=resultat.getString("password");
                System.out.println("username : "+resultat.getString("username")+" Password : "+resultat.getString("password"));
                
            }
            if (password!=mp) {
                result=false;
                System.out.println(result);
                return false;
            }else{
                                result=true;
                System.out.println(result);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur dans la requet : " +e.getLocalizedMessage());
        }
        
        
        return result;
    }
    
}

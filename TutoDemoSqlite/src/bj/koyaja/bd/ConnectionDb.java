package bj.koyaja.bd;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 9589693153
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class ConnectionDb {
    
    public static Connection conn= null;
    public static Connection ConnecrDb(){
        if (conn==null) {
            
       
    try{
    Class.forName("org.sqlite.JDBC");
    Connection conn =DriverManager.getConnection("jdbc:sqlite:Tutosqllite.db");
    //JOptionPane.showMessageDialog(null, "Connection Established");C:\Users\9589693153\Documents\NetBeansProjects\PROMA
        System.out.println("connexion succès");
    return conn;
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
       return null;
       
       } }else
            return conn;
    
    }
    
}
//Class.forName("org.sqlite.JDBC");
//cn=DriverManager.getConnection("jdbc:sqlite:c:/SQlite/PromaLG.db");
//st = cn.createStatement();
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffee_shop_system;


import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class My_CNX {
    private static  String servarname ="localhost"; 
    private static  String username ="root"; 
    private  static String dbname = "coffee_shop_system";
    private  static Integer portnumber=3306; 
    private  static String password="";
    public  static  Connection getConnection()
    {
        Connection cnx=null;
        MysqlDataSource c1=new MysqlDataSource();
        c1.setServerName(servarname);
        c1.setUser(username);
        c1.setPassword(password);
        c1.setDatabaseName(dbname);
        c1.setPortNumber(portnumber);
        try {
            cnx=c1.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get connection->"+My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
     return   cnx; 
    }
    
}

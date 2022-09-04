
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class reportes {
    
    public static Connection getConexion(){
        Connection conexion=null;
        
        try {
            conexion= DriverManager.getConnection("jdbc:mysql://localhost/natural", "root","");
        } catch (SQLException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
}
    


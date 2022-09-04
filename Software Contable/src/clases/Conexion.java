
package clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
   public static final String URL = "jdbc:mysql://localhost:3306/holas"; //Dirección, puerto y nombre de la Base de Datos
public static final String USERNAME = "root"; //Usuario de Acceso a MySQL
public static final String PASSWORD = ""; //Password del usuario

    public static void cerrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Connection con = null;
    
    public Connection getConexion() throws SQLException
    {
        
        try {
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/centronaturista", "root","");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
      return con;  
    }

    Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

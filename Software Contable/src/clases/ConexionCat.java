
package clases;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author jorgeluis
 */

public class ConexionCat {
    
    public DataSource dataSource;
    
    public String db = "ciudades1";
    String url = "jdbc:mysql://localhost:3306/natural";
    // public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "";



    public ConexionCat(){

        inicializaDataSource();

    }



    private void inicializaDataSource(){


        BasicDataSource basicDataSource = new BasicDataSource();

        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUsername(user);
        basicDataSource.setPassword(pass);
        basicDataSource.setUrl(url);
        basicDataSource.setMaxActive(50);

        dataSource = basicDataSource;

    }

    

    
}

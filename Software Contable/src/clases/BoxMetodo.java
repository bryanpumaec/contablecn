
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import ventanas.AdquisicionBox;
import ventanas.NuevoProducto;







/**
 *
 * @author jorgeluis
 */
public class BoxMetodo {
    
    public String[] to_array(ArrayList<String> list){
    
        String array[]=new String[list.size()];
        
        for(int i=0; i<array.length; i++){
            array[i]=list.get(i);
        }
    
        return array;
        
    }

    
    
    
    
    public void consultar(){
    
        ConexionCat metodospool = new ConexionCat();
        
        Connection conectar;
        
        try{
            
            conectar=metodospool.dataSource.getConnection();
            ResultSet rs;
            String sql;
            PreparedStatement pst;
            ArrayList<String>list_departamento = new ArrayList<>();
            ArrayList<String>list_ciudad = new ArrayList<>();            
            boolean condicional=false;
            int id_dep=0;
            int id_dep1=0;

                    
            if(conectar!=null){
                
                String busquedadep;
                if(NuevoProducto.categoria.getItemCount()>0){
                    
                    busquedadep = NuevoProducto.categoria.getSelectedItem().toString();
                    sql="SELECT cat_id FROM categoria where cat_nombre=?";
                    
                    pst=conectar.prepareStatement(sql);
                    pst.setString(1, busquedadep);
                    
                    rs=pst.executeQuery();
                    
                    while(rs.next()){
                    
                        id_dep=rs.getInt("cat_id");
                                            
                    }
                    
                
                
                }else{

                    sql="SELECT cat_id, cat_nombre FROM categoria";
                    
                    pst=conectar.prepareStatement(sql);
                    rs=pst.executeQuery();
                    
                    while(rs.next()){
                        
                        if(condicional==false){
                            
                            id_dep=rs.getInt("cat_id");
                            condicional=true;
                            
                        }
                        
                        list_departamento.add(rs.getString("cat_nombre"));
                    
                    }
                    
                    
                    NuevoProducto.modeldep = new DefaultComboBoxModel(to_array(list_departamento));
                    NuevoProducto.categoria.setModel(NuevoProducto.modeldep);
                    
                
                }
                
               
                
                
                NuevoProducto.modelcid = new DefaultComboBoxModel(to_array(list_ciudad));
//                NuevoProducto.cb_ciudad.setModel(NuevoProducto.modelcid);
                
                conectar.close();
                        
            
            }
            
            
            
            else{
                System.out.println("conexion fallida");
            }
            
        
        }
        
        
        catch(Exception ex){
        
            System.out.println("error "+ex);
        
        }
        
    }
    
}

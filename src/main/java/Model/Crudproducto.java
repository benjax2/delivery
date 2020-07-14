package Model;

import Dao.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Crudproducto implements Operaciones {
	
    Conexion conexion = new Conexion();
    @Override
    public String create(Object object) {
       String respuesta="";
       Producto producto = (Producto) object; 
       Connection connection;
       PreparedStatement pst;
       String query = "insert into producto (nombre,precio,stock,foto) values (?,?,?,?)";
       
       try{
           //conexion y ejecucion sql.
           Class.forName( conexion.getDriver() );
           connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
           pst = (PreparedStatement) connection.prepareStatement(query);
           //pst.setInt(1, producto.getId_producto());
           pst.setString(1, producto.getNombre());
           pst.setInt(2, producto.getPrecio());
           pst.setInt(3, producto.getStock());
           pst.setString(4, producto.getFoto());
           int row = pst.executeUpdate();
       respuesta = "Registro grabado exitosamente";    
       }catch(SQLException e){
       respuesta = e.getMessage();
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(Crudproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
     return respuesta;
    }
    public String delete(Object object) {
        Producto producto = (Producto) object;
        Connection connection;
        PreparedStatement pst;
        String query = "delete from producto where id_producto = ?";
        String respuesta = "";
         try {
             Class.forName(conexion.getDriver());
             connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
             pst = connection.prepareStatement(query);
             
             pst.setInt(1, producto.getId_producto());                        
             pst.executeUpdate();
             
       
             
         } catch (ClassNotFoundException | SQLException e) {
             respuesta = e.getMessage();
         }
         return respuesta;
     }  
    @Override
   	public List<Producto> selectAll() {
   		List<Producto> datos = new ArrayList<>();
   		Connection connection;
   		PreparedStatement pst;
   		// ResultSet --> Permite recorrer una lista.
   		ResultSet resultSet;
   		String query = "select * from producto";
   		try {
   			Class.forName( conexion.getDriver() );
   	           connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
   	           pst = (PreparedStatement) connection.prepareStatement(query);
   	           resultSet= pst.executeQuery();
   	           while(resultSet.next()) {
   	        	   
   	               datos.add(new Producto(resultSet.getInt("id_producto"),resultSet.getString("nombre"),resultSet.getInt("precio"),resultSet.getInt("stock"),resultSet.getString("foto")));
   	           }
   	           
   	           
   	           
   		} catch (ClassNotFoundException | SQLException e) {
   			// TODO: handle exception
   		}
   		return datos;
   	} 
    
   	public List<Producto> buscarId(int id) {
   		List<Producto> datos = new ArrayList<>();
   		Connection connection;
   		PreparedStatement pst;
   		// ResultSet --> Permite recorrer una lista.
   		ResultSet resultSet;
   		String query = "select * from producto where id_producto="+id;
   		try {
   			Class.forName( conexion.getDriver() );
   	           connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
   	           pst = (PreparedStatement) connection.prepareStatement(query);
   	           resultSet= pst.executeQuery();
   	           while(resultSet.next()) {
   	        	   
   	               datos.add(new Producto(resultSet.getInt("id_producto"),resultSet.getString("nombre"),resultSet.getInt("precio"),resultSet.getInt("stock"),resultSet.getString("foto")));
   	           }
   	           
   	           
   	           
   		} catch (ClassNotFoundException | SQLException e) {
   			// TODO: handle exception
   		}
   		return datos;
   	}     
    
   	public String update(Producto p) {

   		String respuesta="";
   		Connection connection;
   		PreparedStatement pst;
   		// ResultSet --> Permite recorrer una lista.
   		ResultSet resultSet;
   		String query = "update producto set nombre='"+p.getNombre()+"', precio='"+p.getPrecio()+"', stock='"+p.getStock()+"', foto='"+p.getFoto()+"' where id_producto="+p.getId_producto();
   		try {
   			Class.forName( conexion.getDriver() );
   	           connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
   	           pst = (PreparedStatement) connection.prepareStatement(query);
   	           resultSet= pst.executeQuery();

   	        respuesta = "Registro grabado exitosamente"+ resultSet.getInt("id_producto")+resultSet.getString("nombre")+resultSet.getInt("precio")+resultSet.getInt("stock")+resultSet.getString("foto");
   		} catch (ClassNotFoundException | SQLException e) {
   			// TODO: handle exception
   			respuesta = e.getMessage();
   		}
   		return respuesta;
   	} 
    
}

package Model;

import Dao.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
       String query = "insert into producto values (?,?,?,?)";
       
       try{
           //conexion y ejecucion sql.
           Class.forName( conexion.getDriver() );
           connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
           pst = (PreparedStatement) connection.prepareStatement(query);
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
   	        	   
   	               datos.add(new Producto(resultSet.getString("nombre"),resultSet.getInt("precio"),resultSet.getInt("stock"),resultSet.getString("foto")));
   	           }
   	           
   	           
   	           
   		} catch (ClassNotFoundException | SQLException e) {
   			// TODO: handle exception
   		}
   		return datos;
   	}    

    
}

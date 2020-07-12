package Model;
import Dao.Producto;
import Dao.Registro_cliente;
import Dao.Registro_local;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Crudlocal implements Operaciones {

    Conexion conexion = new Conexion();
    @Override
    public String create(Object object) {
       String respuesta="";
       Registro_local local = (Registro_local) object; 
       Connection connection;
       PreparedStatement pst;
       String query = "insert into registro_local values (?,?,?,?,?,?,?,?,?)";
       
       try{
           //conexion y ejecucion sql.
           Class.forName( conexion.getDriver() );
           connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
           pst = (PreparedStatement) connection.prepareStatement(query);
           pst.setString(1, local.getNombre());
           pst.setString(2, local.getRut_representante());
           pst.setString(3, local.getEmail());
           pst.setString(4, local.getPwd());
           pst.setInt(5, local.getFono());
           pst.setString(6, local.getDireccion());
           pst.setString(7,local.getComuna());
           pst.setString(8,local.getGiro());
           pst.setString(9,local.getPatente());
           int row = pst.executeUpdate();
       respuesta = "Registro grabado";    
       }catch(SQLException e){
       respuesta = e.getMessage();
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrudPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
     return respuesta;
    }
    @Override
	public List<Registro_local> selectAll() {
		List<Registro_local> datos = new ArrayList<>();
		Connection connection;
		PreparedStatement pst;
		// ResultSet --> Permite recorrer una lista.
		ResultSet resultSet;
		String query = "select * from registro_local";
		try {
			Class.forName( conexion.getDriver() );
	           connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
	           pst = (PreparedStatement) connection.prepareStatement(query);
	           resultSet= pst.executeQuery();
	           while(resultSet.next()) {
	               datos.add(new Registro_local(resultSet.getString("nombre"),resultSet.getString("rut_representante"),resultSet.getString("email"),resultSet.getString("pwd"),resultSet.getInt("fono"),resultSet.getString("direccion"),resultSet.getString("comuna"),resultSet.getString("giro"),resultSet.getString("patente")));
	           }
	           
	           
	           
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
		}
		return datos;
	}    
   

    
}
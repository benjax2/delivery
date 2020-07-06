package Model;
import Dao.Registro_cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrudPersona implements Operaciones {

    Conexion conexion = new Conexion();
    @Override
    public String create(Object object) {
       String respuesta="";
       Registro_cliente cliente = (Registro_cliente) object; 
       Connection connection;
       PreparedStatement pst;
       String query = "insert into registro_cliente values (?,?,?,?,?,?)";
       
       try{
           //conexion y ejecucion sql.
           Class.forName( conexion.getDriver() );
           connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
           pst = (PreparedStatement) connection.prepareStatement(query);
           pst.setString(1, cliente.getNombre());
           pst.setString(2, cliente.getRut());
           pst.setString(3, cliente.getEmail());
           pst.setString(4, cliente.getPwd());
           pst.setInt(5, cliente.getFono());
           pst.setString(6, cliente.getDireccion());
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
	public List<Registro_cliente> selectAll() {
		List<Registro_cliente> datos = new ArrayList<>();
		Connection connection;
		PreparedStatement pst;
		// ResultSet --> Permite recorrer una lista.
		ResultSet resultSet;
		String query = "select * from registro_cliente";
		try {
			Class.forName( conexion.getDriver() );
	           connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
	           pst = (PreparedStatement) connection.prepareStatement(query);
	           resultSet= pst.executeQuery();
	           while(resultSet.next()) {
	               datos.add(new Registro_cliente(resultSet.getString("nombre"), resultSet.getString("rut"), resultSet.getString("email"),resultSet.getString("pwd"),resultSet.getInt("fono"),resultSet.getString("direccion")));
	           }
	           
	           
	           
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
		}
		return datos;
	}    

    
}

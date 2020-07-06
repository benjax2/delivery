package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dao.Registro_cliente;


public class Validar_cliente implements Validar {
	Connection con;
	Conexion conexion = new Conexion();
	Conexion cn = new Conexion();
	PreparedStatement ps;
	ResultSet rs;
	int r = 0;
	@Override
	public int validar(Registro_cliente cliente) {
		String sql = "select * from registro_cliente where email=? and pwd=?";
		try {	
			Class.forName(conexion.getDriver());
			 con = DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
			 ps=con.prepareStatement(sql);
			 ps.setString(1,cliente.getEmail());
			 ps.setString(2, cliente.getPwd());
			 
			 rs=ps.executeQuery();
			 while(rs.next()) {
				 r=r+1;
				 cliente.setEmail(rs.getString("email"));
				 cliente.setPwd(rs.getString("pwd"));
			 }if(r==1) {
				 return 1;
			 }else {
				 return 0;
				 }
		} catch (Exception e) {
			return 0;
		}
		
	}

}

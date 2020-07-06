package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dao.Registro_local;



public class Validar_local implements ValidarC {
	Connection con;
	Conexion conexion = new Conexion();
	Conexion cn = new Conexion();
	PreparedStatement ps;
	ResultSet rs;
	int r = 0;
	@Override
	public int validarC(Registro_local local) {
		String sql = "select * from registro_local where email=? and pwd=?";
		try {	
			Class.forName(conexion.getDriver());
			 con = DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
			 ps=con.prepareStatement(sql);
			 ps.setString(1,local.getEmail());
			 ps.setString(2, local.getPwd());
			 
			 rs=ps.executeQuery();
			 while(rs.next()) {
				 r=r+1;
				 local.setEmail(rs.getString("email"));
				 local.setPwd(rs.getString("pwd"));
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
package es.paqueteria.paqueteria.bbdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultasBD  {
	private static Connection con;
	ResultSet rs;
	PreparedStatement ps = null;
	
	public String mostrarTodasLocalidades() throws SQLException {
		int idl = 0,idz=0;
		String nombrel = null;
		ps = con.prepareStatement("SELECT ID_L ,D_Z,NOMBRE_L FROM PROVINCIA ;");
		rs = ps.executeQuery();
		while(rs.next()) {
		idl = rs.getInt(1);
		idz = rs.getInt(2);
		nombrel = rs.getString(3);
		}
		
		return idl + idz + nombrel;
	}
}

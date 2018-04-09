package es.paqueteria.paqueteria.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

public class conectarMysql {

	private static Connection Conexion;

	public void MySQLConnection(String user, String pass, String db_name) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
			JOptionPane.showMessageDialog(null, "Se ha iniciado la conexión con el servidor de forma exitosa");
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(conectarMysql.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(conectarMysql.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void closeConnection() {
		try {
			Conexion.close();
			System.out.println("Se ha finalizado la conexión con el servidor");
		} catch (SQLException ex) {
			Logger.getLogger(conectarMysql.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public static void main(String[] args) {

		conectarMysql db = new conectarMysql();

		try {
			db.MySQLConnection("root", "", "paqueteria");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

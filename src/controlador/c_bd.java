package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class c_bd {
	public  Connection konexioa() {
		Connection konexioa=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 konexioa =
	DriverManager.getConnection("jdbc:mysql://localhost/rekord_autoak", "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			
		}
		
		return konexioa;
	}
	public Statement stamenta() {
		Statement st=null;
		try {
			st=this.konexioa().createStatement();
		} catch (SQLException | NullPointerException e) {
			// TODO Auto-generated catch block
		}
		return st;
	}
	public ResultSet kargatudatuak(String query) {
		ResultSet rs=null;
		try {
			rs=this.stamenta().executeQuery(query);
		} catch (SQLException |NullPointerException e) {
			// TODO Auto-generated catch block
			
		}
		return rs;
	}
	public boolean DB_aldaketak(String query) {
		try {
			stamenta().executeUpdate(query);
			stamenta().close();
			konexioa().close();
			return true;
		} catch (SQLException | NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
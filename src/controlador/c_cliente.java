package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelo.Cliente;


public class c_cliente {
	public static int compr_documentacion_bd(String documentacion) {
			try {
					String sql="Select COUNT(dni)existe from cliente where dni= ?";
					 Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/bdventalibros", "root", "");
					 PreparedStatement st = konexioa.prepareStatement(sql);
					 st.setString(1, documentacion);
					 
					 ResultSet rs = st.executeQuery();
					 rs.first();
					 if(rs.getInt("existe")==0) {
						 return 1;
					 }else {
						 return 0;
					 }
				}catch(SQLException sqle) {
					return 2;
				}
	}
	public static void sartu(Cliente c0) {
		try{
			String sql="INSERT INTO cliente VALUES (?,?,?,?,?,?,?,?,?,?)";
			Class.forName("com.mysql.jdbc.Driver");
			Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/bdventalibros", "root", "");
			PreparedStatement st = konexioa.prepareStatement(sql);
			st.setString(1, c0.getDocumentacion());
			st.setString(2, c0.getNombre());
			st.setString(3, c0.getApellido());
			st.setString(4, c0.getApellido_2());
			st.setString(5, c0.getTlf());
			st.setString(6, c0.getCorreo());
			st.setString(7, c0.getKalea());
			st.setString(8, c0.getKokapena());
			st.setString(9, c0.getZenbakia());
			st.setString(10, c0.getAtea());
			st.executeUpdate();
			st.close();
			
			konexioa.close();
			
		}
			catch (SQLException | ClassNotFoundException sqle){
			// ez baldin bada konexioa era egokian egin
			}	
	}
	public static void aldatu(Cliente c0){
		try{
			String sql="UPDATE cliente SET nombre=?,apellido=?,apellido_2=?,telefono=?,localizacion=?,calle=?,numero=?,email=?,puerta=? where dni=?";
			Class.forName("com.mysql.jdbc.Driver");
			Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/bdventalibros", "root", "");
			PreparedStatement st = konexioa.prepareStatement(sql);
			st.setString(1, c0.getNombre());
			st.setString(2, c0.getApellido());
			st.setString(3, c0.getApellido_2());
			st.setString(4, c0.getTlf());
			st.setString(5, c0.getKokapena());
			st.setString(6, c0.getKalea());
			st.setString(7, c0.getZenbakia());
			st.setString(8, c0.getCorreo());
			st.setString(9, c0.getAtea());
			st.setString(10, c0.getDocumentacion());
			st.executeUpdate();
			st.close();
			konexioa.close();	
		}
			catch (SQLException | ClassNotFoundException sqle){
			// ez baldin bada konexioa era egokian egin
			}
	}	
}
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.libro;

public class c_libro {
	public static int compr_isbn_bd(String isbn) {
		try {
				String sql="Select COUNT(isbn)existe from libros where isbn= ?";
				 Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/bdventalibros", "root", "");
				 PreparedStatement st = konexioa.prepareStatement(sql);
				 st.setString(1, isbn);
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
	public static void sartu(libro l0) {
		try{
			String sql="INSERT INTO libros VALUES (?,?,?,?,?,?,?,?,?)";
			Class.forName("com.mysql.jdbc.Driver");
			Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/bdventalibros", "root", "");
			PreparedStatement st = konexioa.prepareStatement(sql);
			  st.setString(1, l0.getIsbn()); 
			  st.setString(2, l0.getNombre());
			  st.setString(3, l0.getDescripcion()); 
			  st.setString(4, l0.getAutor());
			  st.setString(5, l0.getEditorial()); 
			  st.setString(6, l0.getGenero());
			  st.setString(7, l0.getTapa()); 
			  st.setString(8, l0.getFecha_lanzamiento());
			  st.setString(9, String.valueOf(l0.getPrecio())); 
			 			
			st.executeUpdate();
			st.close();		
			konexioa.close();	
		}
			catch (SQLException | ClassNotFoundException sqle){
			// ez baldin bada konexioa era egokian egin
			}	
	}
	public static void aldatu(libro l0) {
		try{
			String sql="UPDATE libros SET nombre=?,descripcion=?,autor=?,editorial=?,genero=?,tapa=?,fecha_lanzamiento=?,precio=? where isbn=?";
			Class.forName("com.mysql.jdbc.Driver");
			Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/bdventalibros", "root", "");
			PreparedStatement st = konexioa.prepareStatement(sql);
			st.setString(1, l0.getNombre());
			st.setString(2, l0.getDescripcion());
			st.setString(3, l0.getAutor());
			st.setString(4, l0.getEditorial());
			st.setString(5, l0.getGenero());
			st.setString(6, l0.getTapa());
			st.setString(7, l0.getFecha_lanzamiento());
			st.setString(8, String.valueOf(l0.getPrecio()));
			st.setString(9, l0.getIsbn());
			st.executeUpdate();
			st.close();
			konexioa.close();	
		}
			catch (SQLException | ClassNotFoundException sqle){
			// ez baldin bada konexioa era egokian egin
				
			}
	}
	public static void ezabatu(libro l0) {
		try{
			String sql="Delete from libros where isbn=?";
			Class.forName("com.mysql.jdbc.Driver");
			Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/bdventalibros", "root", "");
			PreparedStatement st = konexioa.prepareStatement(sql);
			st.setString(1, l0.getIsbn());
			st.executeUpdate();
			st.close();
			konexioa.close();	
		}
			catch (SQLException | ClassNotFoundException sqle){
			// ez baldin bada konexioa era egokian egin
				
			}
	}
}

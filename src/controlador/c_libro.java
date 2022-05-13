package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

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
			  st.setFloat(9, l0.getPrecio()); 
			  st.executeUpdate();

			  st.close();		
			  konexioa.close();	
		}
			catch (SQLException | ClassNotFoundException sqle){
			// ez baldin bada konexioa era egokian egin
				sqle.printStackTrace(); 
			}	
	}
	public static void aldatu(libro l0) {
		try{
			String sql="UPDATE libros SET nombre=?,descripción=?,autor=?,editorial=?,genero=?,tapa=?,fecha_lanzamiento=?,precio=? where isbn=?";
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
			st.setFloat(8, l0.getPrecio());
			st.setString(9, l0.getIsbn());
			st.executeUpdate();
			st.close();
			konexioa.close();	
		}
			catch (SQLException | ClassNotFoundException sqle){
			// ez baldin bada konexioa era egokian egin
				sqle.printStackTrace();
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
	public static void kargatu_taula(JTable table,DefaultTableModel dtm) {
		int zutabeKopurua=0;
		Vector<String> zutabeak=null;
		Vector<Vector<String>> datuakTabla=null;
		try {
		Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/bdventalibros", "root", "");
		String query=("SELECT * FROM libros");
		PreparedStatement st = konexioa.prepareStatement(query);
		ResultSet rs=st.executeQuery(query);
		ResultSetMetaData metaDatuak = (ResultSetMetaData) rs.getMetaData();
		// zutabe kopurua atera
		zutabeKopurua = metaDatuak.getColumnCount();
		zutabeak = new Vector<String>();
		datuakTabla = new Vector<Vector<String>>();
		// zutabe bakoitzaren etiketa hartu
		// zutabeen burukoak
		// zutabe bakoitzaren etiketa hartu
		for (int i = 0; i < zutabeKopurua; i++){
		// zutabearen etiketaren balioa hartu
		// rs datuak 1ean hasi
		zutabeak.add(metaDatuak.getColumnLabel(i + 1));
		}
		while (rs.next()){
			Vector<String> lerroa = new Vector<String>();
			lerroa.add(rs.getString("isbn"));
			lerroa.add(rs.getString("nombre"));
			lerroa.add(rs.getString("descripción"));
			lerroa.add(rs.getString("autor"));
			lerroa.add(rs.getString("editorial"));
			lerroa.add(rs.getString("genero"));
			lerroa.add(rs.getString("tapa"));
			lerroa.add(rs.getString("fecha_lanzamiento"));
			lerroa.add(String.valueOf(rs.getFloat("precio")));
			lerroa.add("\n\n\n\n\n\n\n");
			datuakTabla.add(lerroa);	
		}
		dtm= new DefaultTableModel(datuakTabla,zutabeak);
		table.setModel(dtm);
			// ResultSet itxi
			rs.close();
			st.close();
			konexioa.close();
			// konexioa itxi
			TableRowSorter<DefaultTableModel> ordenatzeMetodoa = new TableRowSorter<>(
					dtm);
			table.setRowSorter(ordenatzeMetodoa);
			ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
			// Lehen zutabearen arabera ordenatzeko (nan gure kasuan) behetik gora.
			int columnIndexToSort = 0;
			sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));
			ordenatzeMetodoa.setSortKeys(sortKeys);
			ordenatzeMetodoa.sort(); 
			
		} catch (SQLException | NullPointerException x) {
			x.printStackTrace();
		}
	}
}

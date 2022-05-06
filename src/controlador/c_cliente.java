package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelo.Cliente;


public class c_cliente extends c_bd{
	public static void cargarDatosTablaikas(Vector<String> zutabeak,Vector<Vector<String>> datuak,DefaultTableModel dtm_bezero,JTable table) {
		 
		 try{
	//konexioa egin datu basearekin.
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/rekord_autoak", "root", "");


	Statement st = konexioa.createStatement();
	ResultSet rs = st.executeQuery("SELECT * FROM cliente");
	

	ResultSetMetaData metaDatuak = (ResultSetMetaData) rs.getMetaData();
	// zutabe kopurua atera
	int zutabeKopurua = metaDatuak.getColumnCount();
	zutabeak = new Vector<String>();
	// zutabe bakoitzaren etiketa hartu
	for (int i = 0; i < zutabeKopurua; i++){
	// zutabearen etiketaren balioa hartu
	// rs datuak 1ean hasi
	zutabeak.add(metaDatuak.getColumnLabel(i + 1));
	}

	// datuentzako bektorea sortu.
	datuak = new Vector<Vector<String>>();
	// banan banan ikasle guztiak gehituko ditugu
	while (rs.next()) {
	Vector<String> lerroa = new Vector<String>();	
	lerroa.add(rs.getString("Identificador"));
	lerroa.add(rs.getString("NombreCliente"));
	lerroa.add(rs.getString("ApellCliente"));
	lerroa.add(rs.getString("ApellCliente2"));
	lerroa.add(rs.getString("TelCliente"));
	lerroa.add(rs.getString("LocalidadCliente"));
	lerroa.add(rs.getString("CalleCliente"));
	lerroa.add(rs.getString("NumDirCliente"));
	lerroa.add(rs.getString("email"));
	lerroa.add(rs.getString("PuertaCliente"));
	lerroa.add("\n\n\n\n\n\n\n");
	datuak.add(lerroa);
	}

	//JTable egin
	dtm_bezero = new DefaultTableModel(datuak, zutabeak);
	table.setModel(dtm_bezero);
	table.setAutoCreateRowSorter(true);
	
	rs.close();
	
	st.close();

	konexioa.close();
	}
	catch (SQLException| ClassNotFoundException sqle){
	// ez baldin bada konexioa era egokian egin
		JOptionPane.showMessageDialog(null,(String)"Datu basea ez dago konektatuta","Errorea",
				JOptionPane.ERROR_MESSAGE,null);
	}
	} 
	public static void sartu(Cliente c0) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/bdventaordenadores", "root", "");
			Statement st = konexioa.createStatement();
			st.executeUpdate("INSERT INTO cliente VALUES ('"+c0.getDocumentacion()+"','"+c0.getNombre()+"','"+c0.getApellido()+"','"+c0.getApellido_2()+"','"+c0.getTlf()+"','"+c0.getCorreo()+"','"+c0.getKalea()+"','"+c0.getKokapena()+"','"+c0.getZenbakia()+"','"+c0.getAtea()+"')" );
			st.close();
			
			konexioa.close();
			
		}
			catch (SQLException | ClassNotFoundException sqle){
			// ez baldin bada konexioa era egokian egin
				sqle.printStackTrace();
			}	
	}
	public static void aldatu(Cliente c0){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/bdventaordenadores", "root", "");
			Statement st = konexioa.createStatement();
		
			st.executeUpdate("UPDATE cliente SET nombre='"+c0.getNombre()+"',apellido='"+c0.getApellido()+"',apellido_2='"+c0.getApellido_2()+"',telefono='"+c0.getTlf()+"',localizacion='"+c0.getKokapena()+"',calle='"+c0.getKalea()+"',numero='"+c0.getZenbakia()+"',email='"+c0.getCorreo()+"',puerta='"+c0.getAtea()+"'where dni='"+c0.getDocumentacion()+"'");
			
			st.close();
			
				konexioa.close();
			
		}
			catch (SQLException | ClassNotFoundException sqle){
			// ez baldin bada konexioa era egokian egin
				sqle.printStackTrace();
			}	
}	
}
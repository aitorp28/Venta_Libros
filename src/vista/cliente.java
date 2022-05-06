package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import controlador.c_cliente;
import modelo.Cliente;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class cliente extends JFrame {

	private JPanel contentPane;
	private JTextField telefonoa;
	private JTextField email;
	private JTextField izena;
	private JTextField abizena;
	private JTextField abizena_2;
	private JTextField dni;
	private JTextField kokapena;
	private JTextField kalea;
	private JTextField zenbakia;
	private JTextField atea;
	private JComboBox identificador;
	private int resto = 0;
	private char Letra = 0;
	private int sum;
	private char Letra_array;
	private char[] letrak = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
			'L', 'C', 'K', 'E' };
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cliente frame = new cliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		identificador = new JComboBox();
		identificador.setBounds(10, 47, 90, 22);
		contentPane.add(identificador);
		identificador.addItem("NAN");
		identificador.addItem("NIE");
		identificador.addItem("CIF");
		
		JLabel lblnombre = new JLabel("Izena");
		lblnombre.setBounds(10, 80, 90, 22);
		contentPane.add(lblnombre);
		
		JLabel lblape = new JLabel("Abizena");
		lblape.setBounds(10, 113, 90, 22);
		contentPane.add(lblape);
		
		JLabel lblape2 = new JLabel("Bigarren abizena");
		lblape2.setBounds(10, 146, 90, 22);
		contentPane.add(lblape2);
		
		JLabel lbltel = new JLabel("Telefonoa");
		lbltel.setBounds(10, 179, 90, 22);
		contentPane.add(lbltel);
		
		telefonoa = new JTextField();
		telefonoa.setBounds(110, 179, 152, 22);
		contentPane.add(telefonoa);
		telefonoa.setColumns(10);
		
		JLabel lblloc = new JLabel("Kokapena");
		lblloc.setBounds(272, 47, 90, 22);
		contentPane.add(lblloc);
		
		JLabel lblcalle = new JLabel("Kalea");
		lblcalle.setBounds(272, 80, 90, 22);
		contentPane.add(lblcalle);
		
		JLabel lblnum = new JLabel("Zenbakia");
		lblnum.setBounds(272, 113, 90, 22);
		contentPane.add(lblnum);
		
		JLabel lblpuer = new JLabel("Atea");
		lblpuer.setBounds(272, 146, 90, 22);
		contentPane.add(lblpuer);
		
		JLabel lblemail = new JLabel("Email");
		lblemail.setBounds(272, 179, 90, 22);
		contentPane.add(lblemail);
		
		email = new JTextField();
		email.setBounds(337, 179, 152, 22);
		contentPane.add(email);
		email.setColumns(10);
		
		izena = new JTextField();
		izena.setBounds(110, 81, 152, 22);
		contentPane.add(izena);
		izena.setColumns(10);
		
		abizena = new JTextField();
		abizena.setBounds(110, 114, 152, 22);
		contentPane.add(abizena);
		abizena.setColumns(10);
		
		abizena_2 = new JTextField();
		abizena_2.setBounds(110, 147, 152, 21);
		contentPane.add(abizena_2);
		abizena_2.setColumns(10);
		
		dni = new JTextField();
		dni.setBounds(110, 48, 152, 21);
		contentPane.add(dni);
		dni.setColumns(10);
		
		kokapena = new JTextField();
		kokapena.setBounds(337, 48, 152, 21);
		contentPane.add(kokapena);
		kokapena.setColumns(10);
		
		kalea = new JTextField();
		kalea.setBounds(337, 81, 152, 22);
		contentPane.add(kalea);
		kalea.setColumns(10);
		
		zenbakia = new JTextField();
		zenbakia.setBounds(337, 114, 152, 21);
		contentPane.add(zenbakia);
		zenbakia.setColumns(10);
		
		atea = new JTextField();
		atea.setBounds(337, 147, 152, 21);
		contentPane.add(atea);
		atea.setColumns(10);
		
		JButton sartu = new JButton("Sartu");
		sartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sartu();
			}
		});
		sartu.setBounds(399, 226, 90, 23);
		contentPane.add(sartu);
		
		JButton aldatu = new JButton("Aldatu");
		aldatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aldatu();
			}
		});
		aldatu.setBounds(299, 226, 90, 23);
		contentPane.add(aldatu);
	}
	private void vacio() {
		dni.setText("");
		izena.setText("");
		abizena.setText("");
		abizena_2.setText("");
		telefonoa.setText("");
		kokapena.setText("");
		kalea.setText("");
		zenbakia.setText("");
		atea.setText("");
		email.setText("");
	}
	private void sartu() {
		if(!compvacio()) {
			if(KonprobatzaileaDokumentazioa(dni.getText().trim())) {
				/*
					Cliente c0=new Cliente(dni.getText().trim(),izena.getText().trim(),abizena.getText().trim(),abizena_2.getText().trim(), telefonoa.getText().trim(),email.getText().trim(),kokapena.getText().trim(),kalea.getText().trim(), zenbakia.getText().trim(), atea.getText().trim());
					c_cliente.sartu(c0);
					vacio();
					*/
			}else {
			}
		
		}else {
			JOptionPane.showMessageDialog(null,(String)"Debes rellenar todos los campos","Error",
					JOptionPane.ERROR_MESSAGE,null);
		}
	}
	private void aldatu() {
		if(compvacio()) {
			Cliente c0=new Cliente(dni.getText().trim(),izena.getText().trim(),abizena.getText().trim(),abizena_2.getText().trim(), telefonoa.getText().trim(),email.getText().trim(),kokapena.getText().trim(),kalea.getText().trim(), zenbakia.getText().trim(), atea.getText().trim());
			c_cliente.aldatu(c0);
			vacio();
		}else {
			
		}
	}
	private boolean compvacio() {
			return (dni.getText().equals("") || izena.getText().equals("") || abizena.getText().equals("") || abizena_2.getText().equals("") || telefonoa.getText().equals("") || kokapena.getText().equals("") || kalea.getText().equals("") || zenbakia.getText().equals("") || atea.getText().equals("") || email.getText().equals(""));
		
	}
	private Boolean compr_nom_ape(String nom_ape) {
		String regex_nom_ape="^[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+(\\s*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]*)*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+$";
		return Pattern.matches(regex_nom_ape,nom_ape);
	}
	private Boolean validarDNI_num(String dni) {
		Letra = dni.charAt(8);
		sum = Integer.parseInt(dni.substring(0, 8));
		resto = sum % 23;
		Letra_array = letrak[resto];
		if (Letra == Letra_array) {
			return true;
		} else {
			return false;
		}
	}
	private Boolean validarNIE_letra(String nie) {
		 Letra=nie.charAt(8);
			sum=Integer.parseInt(nie.substring(1,8));
			resto=sum % 23;
			Letra_array=letrak[resto];
			if(Letra==Letra_array) {
				return true;
			}else {
				return false;
			}
	}
	private Boolean telefono(String telefono) {
		String regex_telefono="^[0-9]{8,8}[A-Za-z]$";
		return (Pattern.matches(regex_telefono,telefono));
	}
	private Boolean email(String email) {
		String regex_telefono="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		return (Pattern.matches(regex_telefono,email));
	}
	private Boolean numero(String numero) {
		try {
			Integer.parseInt(numero);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	private Boolean compr_docu() {
		
		return true;
	}
	private Boolean documentacion(String documentacion) {
		String regex_dni="^[0-9]{8,8}[A-Za-z]$";
		String regex_cif="^[A-Za-z][0-9]{7,7}[A-Za-z0-9]$";
		String regex_nie="((([X-Z])|([LM])){1}([-]?)((\\d){7})([-]?)([A-Z]{1}))|((\\d{8})([-]?)([A-Z]))";
		return (Pattern.matches(regex_dni,documentacion) || Pattern.matches(regex_cif,documentacion)|| Pattern.matches(regex_nie,documentacion));
	}
	private boolean KonprobatzaileaDokumentazioa(String  doc) {
		boolean Konpr=true; 
	if(documentacion(doc)) {
		if(identificador.getSelectedIndex()==0) {
			if(validarDNI_num(doc.trim())) {
				Konpr=true;
			}
			else {
				Konpr=false;
			}
		}
		else if(identificador.getSelectedIndex()==1) {
			if(validarNIE_letra(doc.trim())) {
				Konpr=true;
			}
			else {
				Konpr=false;
			}
		}
		else if(identificador.getSelectedIndex()==2) {
			String regex_cif="^[A-Za-z][0-9]{7,7}[A-Za-z0-9]$";
			Konpr=Pattern.matches(regex_cif,doc);
		}
	}else {
		Konpr=false;
	}
		return Konpr;
	}
}
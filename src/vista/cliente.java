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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dialog.ModalExclusionType;

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
					frame.setResizable(false);
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
		setBounds(100, 100, 768, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 63, 107, 152, 157, 150, 0};
		gbl_contentPane.rowHeights = new int[]{47, 22, 23, 26, 24, 24, 0, 40, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		identificador = new JComboBox();
		GridBagConstraints gbc_identificador = new GridBagConstraints();
		gbc_identificador.fill = GridBagConstraints.BOTH;
		gbc_identificador.insets = new Insets(0, 0, 5, 5);
		gbc_identificador.gridx = 2;
		gbc_identificador.gridy = 1;
		contentPane.add(identificador, gbc_identificador);
		identificador.addItem("NAN");
		identificador.addItem("NIE");
		identificador.addItem("CIF");
		
		dni = new JTextField();
		GridBagConstraints gbc_dni = new GridBagConstraints();
		gbc_dni.fill = GridBagConstraints.BOTH;
		gbc_dni.insets = new Insets(0, 0, 5, 5);
		gbc_dni.gridx = 3;
		gbc_dni.gridy = 1;
		contentPane.add(dni, gbc_dni);
		dni.setColumns(10);
		
		kokapena = new JTextField();
		GridBagConstraints gbc_kokapena = new GridBagConstraints();
		gbc_kokapena.fill = GridBagConstraints.BOTH;
		gbc_kokapena.insets = new Insets(0, 0, 5, 0);
		gbc_kokapena.gridx = 5;
		gbc_kokapena.gridy = 1;
		contentPane.add(kokapena, gbc_kokapena);
		kokapena.setColumns(10);
		
		JLabel lblloc = new JLabel("Localidad");
		GridBagConstraints gbc_lblloc = new GridBagConstraints();
		gbc_lblloc.anchor = GridBagConstraints.EAST;
		gbc_lblloc.fill = GridBagConstraints.VERTICAL;
		gbc_lblloc.insets = new Insets(0, 0, 5, 5);
		gbc_lblloc.gridx = 4;
		gbc_lblloc.gridy = 1;
		contentPane.add(lblloc, gbc_lblloc);
		
		JLabel lblnombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblnombre = new GridBagConstraints();
		gbc_lblnombre.fill = GridBagConstraints.BOTH;
		gbc_lblnombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblnombre.gridx = 2;
		gbc_lblnombre.gridy = 2;
		contentPane.add(lblnombre, gbc_lblnombre);
		
		izena = new JTextField();
		GridBagConstraints gbc_izena = new GridBagConstraints();
		gbc_izena.fill = GridBagConstraints.BOTH;
		gbc_izena.insets = new Insets(0, 0, 5, 5);
		gbc_izena.gridx = 3;
		gbc_izena.gridy = 2;
		contentPane.add(izena, gbc_izena);
		izena.setColumns(10);
		
		kalea = new JTextField();
		GridBagConstraints gbc_kalea = new GridBagConstraints();
		gbc_kalea.fill = GridBagConstraints.BOTH;
		gbc_kalea.insets = new Insets(0, 0, 5, 0);
		gbc_kalea.gridx = 5;
		gbc_kalea.gridy = 2;
		contentPane.add(kalea, gbc_kalea);
		kalea.setColumns(10);
		
		JLabel lblcalle = new JLabel("Calle");
		GridBagConstraints gbc_lblcalle = new GridBagConstraints();
		gbc_lblcalle.anchor = GridBagConstraints.EAST;
		gbc_lblcalle.fill = GridBagConstraints.VERTICAL;
		gbc_lblcalle.insets = new Insets(0, 0, 5, 5);
		gbc_lblcalle.gridx = 4;
		gbc_lblcalle.gridy = 2;
		contentPane.add(lblcalle, gbc_lblcalle);
		
		JLabel lblape = new JLabel("Apellido");
		GridBagConstraints gbc_lblape = new GridBagConstraints();
		gbc_lblape.fill = GridBagConstraints.BOTH;
		gbc_lblape.insets = new Insets(0, 0, 5, 5);
		gbc_lblape.gridx = 2;
		gbc_lblape.gridy = 3;
		contentPane.add(lblape, gbc_lblape);
		
		abizena = new JTextField();
		GridBagConstraints gbc_abizena = new GridBagConstraints();
		gbc_abizena.fill = GridBagConstraints.BOTH;
		gbc_abizena.insets = new Insets(0, 0, 5, 5);
		gbc_abizena.gridx = 3;
		gbc_abizena.gridy = 3;
		contentPane.add(abizena, gbc_abizena);
		abizena.setColumns(10);
		
		JLabel lblnum = new JLabel("Numero");
		GridBagConstraints gbc_lblnum = new GridBagConstraints();
		gbc_lblnum.anchor = GridBagConstraints.EAST;
		gbc_lblnum.fill = GridBagConstraints.VERTICAL;
		gbc_lblnum.insets = new Insets(0, 0, 5, 5);
		gbc_lblnum.gridx = 4;
		gbc_lblnum.gridy = 3;
		contentPane.add(lblnum, gbc_lblnum);
		
		zenbakia = new JTextField();
		GridBagConstraints gbc_zenbakia = new GridBagConstraints();
		gbc_zenbakia.fill = GridBagConstraints.BOTH;
		gbc_zenbakia.insets = new Insets(0, 0, 5, 0);
		gbc_zenbakia.gridx = 5;
		gbc_zenbakia.gridy = 3;
		contentPane.add(zenbakia, gbc_zenbakia);
		zenbakia.setColumns(10);
		
		JLabel lblape2 = new JLabel("Segundo Apellido");
		GridBagConstraints gbc_lblape2 = new GridBagConstraints();
		gbc_lblape2.fill = GridBagConstraints.BOTH;
		gbc_lblape2.insets = new Insets(0, 0, 5, 5);
		gbc_lblape2.gridx = 2;
		gbc_lblape2.gridy = 4;
		contentPane.add(lblape2, gbc_lblape2);
		
		abizena_2 = new JTextField();
		GridBagConstraints gbc_abizena_2 = new GridBagConstraints();
		gbc_abizena_2.fill = GridBagConstraints.BOTH;
		gbc_abizena_2.insets = new Insets(0, 0, 5, 5);
		gbc_abizena_2.gridx = 3;
		gbc_abizena_2.gridy = 4;
		contentPane.add(abizena_2, gbc_abizena_2);
		abizena_2.setColumns(10);
		
		JLabel lblpuer = new JLabel("Puerta");
		GridBagConstraints gbc_lblpuer = new GridBagConstraints();
		gbc_lblpuer.anchor = GridBagConstraints.EAST;
		gbc_lblpuer.fill = GridBagConstraints.VERTICAL;
		gbc_lblpuer.insets = new Insets(0, 0, 5, 5);
		gbc_lblpuer.gridx = 4;
		gbc_lblpuer.gridy = 4;
		contentPane.add(lblpuer, gbc_lblpuer);
		
		atea = new JTextField();
		GridBagConstraints gbc_atea = new GridBagConstraints();
		gbc_atea.fill = GridBagConstraints.BOTH;
		gbc_atea.insets = new Insets(0, 0, 5, 0);
		gbc_atea.gridx = 5;
		gbc_atea.gridy = 4;
		contentPane.add(atea, gbc_atea);
		atea.setColumns(10);
		
		JLabel lbltel = new JLabel("Telefono");
		GridBagConstraints gbc_lbltel = new GridBagConstraints();
		gbc_lbltel.fill = GridBagConstraints.BOTH;
		gbc_lbltel.insets = new Insets(0, 0, 5, 5);
		gbc_lbltel.gridx = 2;
		gbc_lbltel.gridy = 5;
		contentPane.add(lbltel, gbc_lbltel);
		
		telefonoa = new JTextField();
		GridBagConstraints gbc_telefonoa = new GridBagConstraints();
		gbc_telefonoa.fill = GridBagConstraints.BOTH;
		gbc_telefonoa.insets = new Insets(0, 0, 5, 5);
		gbc_telefonoa.gridx = 3;
		gbc_telefonoa.gridy = 5;
		contentPane.add(telefonoa, gbc_telefonoa);
		telefonoa.setColumns(10);
		
		JLabel lblemail = new JLabel("Email");
		GridBagConstraints gbc_lblemail = new GridBagConstraints();
		gbc_lblemail.anchor = GridBagConstraints.EAST;
		gbc_lblemail.fill = GridBagConstraints.VERTICAL;
		gbc_lblemail.insets = new Insets(0, 0, 5, 5);
		gbc_lblemail.gridx = 4;
		gbc_lblemail.gridy = 5;
		contentPane.add(lblemail, gbc_lblemail);
		
		email = new JTextField();
		GridBagConstraints gbc_email = new GridBagConstraints();
		gbc_email.fill = GridBagConstraints.BOTH;
		gbc_email.insets = new Insets(0, 0, 5, 0);
		gbc_email.gridx = 5;
		gbc_email.gridy = 5;
		contentPane.add(email, gbc_email);
		email.setColumns(10);
		
		JButton aldatu = new JButton("Aldatu");
		aldatu.setBackground(new Color(255, 140, 0));
		
		aldatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aldatu();
			}
		});
		GridBagConstraints gbc_aldatu = new GridBagConstraints();
		gbc_aldatu.fill = GridBagConstraints.VERTICAL;
		gbc_aldatu.insets = new Insets(0, 0, 5, 5);
		gbc_aldatu.gridx = 4;
		gbc_aldatu.gridy = 6;
		contentPane.add(aldatu, gbc_aldatu);
		
		JButton sartu = new JButton("Sartu");
		sartu.setBackground(new Color(50, 205, 50));
		sartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sartu();
			}
		});
		GridBagConstraints gbc_sartu = new GridBagConstraints();
		gbc_sartu.insets = new Insets(0, 0, 5, 0);
		gbc_sartu.fill = GridBagConstraints.VERTICAL;
		gbc_sartu.gridx = 5;
		gbc_sartu.gridy = 6;
		contentPane.add(sartu, gbc_sartu);
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
			if(KonprobatzaileaDokumentazioa(dni.getText().trim()) && compr_nom_ape(izena.getText().trim()) && compr_nom_ape(abizena.getText().trim()) && compr_nom_ape(abizena_2.getText().trim()) && telefono(telefonoa.getText().trim()) && compr_nom_ape(kokapena.getText().trim()) && compr_nom_ape(kalea.getText().trim()) && numero(zenbakia.getText().trim()) && compr_nom_ape(atea.getText().trim()) && email(email.getText().trim())) {
				if(c_cliente.compr_documentacion_bd(dni.getText().trim())==1){
					Cliente c0=new Cliente(dni.getText().trim(),izena.getText().trim(),abizena.getText().trim(),abizena_2.getText().trim(), telefonoa.getText().trim(),email.getText().trim(),kokapena.getText().trim(),kalea.getText().trim(), zenbakia.getText().trim(), atea.getText().trim());
					c_cliente.sartu(c0);
					JOptionPane.showMessageDialog(null,(String)"El cliente ha sido creado con exito","Exito",
							JOptionPane.INFORMATION_MESSAGE,null);
					vacio();	
					
				}else{
					JOptionPane.showMessageDialog(null,(String)"Este cliente ya existe","Error",
							JOptionPane.ERROR_MESSAGE,null);
				}
			}else {
				JOptionPane.showMessageDialog(null,(String)"Comprueba que todos los datos sean correctos","Error",
						JOptionPane.ERROR_MESSAGE,null);
			}
		
		}else {
			JOptionPane.showMessageDialog(null,(String)"Debes rellenar todos los campos","Error",
					JOptionPane.ERROR_MESSAGE,null);
		}
	}
	private void aldatu() {
		if(!compvacio()) {
			if(KonprobatzaileaDokumentazioa(dni.getText().trim()) && compr_nom_ape(izena.getText().trim()) && compr_nom_ape(abizena.getText().trim()) && compr_nom_ape(abizena_2.getText().trim()) && telefono(telefonoa.getText().trim()) && compr_nom_ape(kokapena.getText().trim()) && compr_nom_ape(kalea.getText().trim()) && numero(zenbakia.getText().trim()) && compr_nom_ape(atea.getText().trim()) && email(email.getText().trim())) {
			if(c_cliente.compr_documentacion_bd(dni.getText().trim())==0){
				Cliente c0=new Cliente(dni.getText().trim(),izena.getText().trim(),abizena.getText().trim(),abizena_2.getText().trim(), telefonoa.getText().trim(),email.getText().trim(),kokapena.getText().trim(),kalea.getText().trim(), zenbakia.getText().trim(), atea.getText().trim());
				c_cliente.aldatu(c0);
				JOptionPane.showMessageDialog(null,(String)"Se han actualizado sus datos","Exito",
						JOptionPane.INFORMATION_MESSAGE,null);
				vacio();
			}else {
				JOptionPane.showMessageDialog(null,(String)"Este cliente no existe","Error",
						JOptionPane.ERROR_MESSAGE,null);
			}
		}else {
			JOptionPane.showMessageDialog(null,(String)"Comprueba que todos los datos sean correctos","Error",
					JOptionPane.ERROR_MESSAGE,null);
		}
		}else {
			JOptionPane.showMessageDialog(null,(String)"Debes rellenar todos los campos","Error",
					JOptionPane.ERROR_MESSAGE,null);
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
		String regex_telefono="^[0-9]{9,9}$";
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
package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Panel;
import java.util.Date;
import java.util.regex.Pattern;

import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.event.InputMethodListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.DropMode;

public class Libros extends JFrame {

	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfAutor;
	private JTextField tfGenero;
	private JTextField tfEditorial;
	private JTextField tfFechaDeLanzamiento;
	private JLabel lblTituloLibros;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnCrear;
	private JLabel lblISBN;
	private JTextField tfISBN;
	private JLabel lblPrecio;
	private JTextField tfPrecio;
	private JLabel lblDescripcion;
	private Panel panel;
	private JRadioButtonMenuItem rdbtnmntmNewRadioItem;
	private JRadioButton rbtnTapaDura;
	private JRadioButton rbtnTapaBlanda;
	private JScrollPane scrollPane;
	private JTextArea taDescripcion;
	private JScrollPane scrollPane_1;
	private JTable tbLibros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Libros frame = new Libros();
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
	public Libros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 119, 118, 130, 155, 0, 0, 122, 0};
		gbl_contentPane.rowHeights = new int[]{59, 41, 46, 42, 0, 0, 0, 0, 31, 0, 110, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblTituloLibros = new JLabel("LIBROS ");
		lblTituloLibros.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTituloLibros = new GridBagConstraints();
		gbc_lblTituloLibros.insets = new Insets(0, 0, 5, 5);
		gbc_lblTituloLibros.gridx = 3;
		gbc_lblTituloLibros.gridy = 0;
		contentPane.add(lblTituloLibros, gbc_lblTituloLibros);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		tfNombre = new JTextField();
	
		GridBagConstraints gbc_tfNombre = new GridBagConstraints();
		gbc_tfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_tfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNombre.gridx = 2;
		gbc_tfNombre.gridy = 1;
		contentPane.add(tfNombre, gbc_tfNombre);
		
		tfNombre.setColumns(10);
		
		
		
		JLabel lblEditorial = new JLabel("Editorial");
		GridBagConstraints gbc_lblEditorial = new GridBagConstraints();
		gbc_lblEditorial.anchor = GridBagConstraints.EAST;
		gbc_lblEditorial.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditorial.gridx = 3;
		gbc_lblEditorial.gridy = 1;
		contentPane.add(lblEditorial, gbc_lblEditorial);
		
		tfEditorial = new JTextField();
		GridBagConstraints gbc_tfEditorial = new GridBagConstraints();
		gbc_tfEditorial.insets = new Insets(0, 0, 5, 5);
		gbc_tfEditorial.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfEditorial.gridx = 4;
		gbc_tfEditorial.gridy = 1;
		contentPane.add(tfEditorial, gbc_tfEditorial);
		tfEditorial.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor");
		GridBagConstraints gbc_lblAutor = new GridBagConstraints();
		gbc_lblAutor.anchor = GridBagConstraints.EAST;
		gbc_lblAutor.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutor.gridx = 1;
		gbc_lblAutor.gridy = 2;
		contentPane.add(lblAutor, gbc_lblAutor);
		
		tfAutor = new JTextField();
		GridBagConstraints gbc_tfAutor = new GridBagConstraints();
		gbc_tfAutor.insets = new Insets(0, 0, 5, 5);
		gbc_tfAutor.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfAutor.gridx = 2;
		gbc_tfAutor.gridy = 2;
		contentPane.add(tfAutor, gbc_tfAutor);
		tfAutor.setColumns(10);
		
		JLabel lblFechaDeLanzamiento = new JLabel("Fecha de lanzamiento");
		GridBagConstraints gbc_lblFechaDeLanzamiento = new GridBagConstraints();
		gbc_lblFechaDeLanzamiento.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeLanzamiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeLanzamiento.gridx = 3;
		gbc_lblFechaDeLanzamiento.gridy = 2;
		contentPane.add(lblFechaDeLanzamiento, gbc_lblFechaDeLanzamiento);
		
		tfFechaDeLanzamiento = new JTextField();
		GridBagConstraints gbc_tfFechaDeLanzamiento = new GridBagConstraints();
		gbc_tfFechaDeLanzamiento.insets = new Insets(0, 0, 5, 5);
		gbc_tfFechaDeLanzamiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfFechaDeLanzamiento.gridx = 4;
		gbc_tfFechaDeLanzamiento.gridy = 2;
		contentPane.add(tfFechaDeLanzamiento, gbc_tfFechaDeLanzamiento);
		tfFechaDeLanzamiento.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero");
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.anchor = GridBagConstraints.EAST;
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 1;
		gbc_lblGenero.gridy = 3;
		contentPane.add(lblGenero, gbc_lblGenero);
		
		tfGenero = new JTextField();
		GridBagConstraints gbc_tfGenero = new GridBagConstraints();
		gbc_tfGenero.insets = new Insets(0, 0, 5, 5);
		gbc_tfGenero.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfGenero.gridx = 2;
		gbc_tfGenero.gridy = 3;
		contentPane.add(tfGenero, gbc_tfGenero);
		tfGenero.setColumns(10);
		
		lblISBN = new JLabel("ISBN");
		GridBagConstraints gbc_lblISBN = new GridBagConstraints();
		gbc_lblISBN.anchor = GridBagConstraints.EAST;
		gbc_lblISBN.insets = new Insets(0, 0, 5, 5);
		gbc_lblISBN.gridx = 3;
		gbc_lblISBN.gridy = 3;
		contentPane.add(lblISBN, gbc_lblISBN);
		
		tfISBN = new JTextField();
		tfISBN.setColumns(10);
		GridBagConstraints gbc_tfISBN = new GridBagConstraints();
		gbc_tfISBN.insets = new Insets(0, 0, 5, 5);
		gbc_tfISBN.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfISBN.gridx = 4;
		gbc_tfISBN.gridy = 3;
		contentPane.add(tfISBN, gbc_tfISBN);
		
		lblPrecio = new JLabel("Precio \u20AC");
		lblPrecio.setVerticalAlignment(SwingConstants.TOP);
		lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 4;
		contentPane.add(lblPrecio, gbc_lblPrecio);
		
		tfPrecio = new JTextField();
		GridBagConstraints gbc_tfPrecio = new GridBagConstraints();
		gbc_tfPrecio.anchor = GridBagConstraints.NORTH;
		gbc_tfPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_tfPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPrecio.gridx = 2;
		gbc_tfPrecio.gridy = 4;
		contentPane.add(tfPrecio, gbc_tfPrecio);
		tfPrecio.setColumns(10);
		
		lblDescripcion = new JLabel("Descripcion");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 3;
		gbc_lblDescripcion.gridy = 4;
		contentPane.add(lblDescripcion, gbc_lblDescripcion);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 4;
		gbc_scrollPane.gridy = 4;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		taDescripcion = new JTextArea();
		taDescripcion.setLineWrap(true);
		scrollPane.setViewportView(taDescripcion);
		
		panel = new Panel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 5;
		contentPane.add(panel, gbc_panel);
		
		rbtnTapaBlanda = new JRadioButton("Tabla Blanda");
		panel.add(rbtnTapaBlanda);
		
		rbtnTapaDura = new JRadioButton("Tapa Dura");
		panel.add(rbtnTapaDura);
		
		rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("New radio item");
		panel.add(rdbtnmntmNewRadioItem);
		
		btnCrear = new JButton("Crear");
		btnCrear.setBackground(new Color(50, 205, 50));
		GridBagConstraints gbc_btnCrear = new GridBagConstraints();
		gbc_btnCrear.ipadx = 15;
		gbc_btnCrear.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrear.gridx = 2;
		gbc_btnCrear.gridy = 7;
		contentPane.add(btnCrear, gbc_btnCrear);
		btnCrear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

			if(comprobar_Autor(tfAutor.getText().trim())
									&&comprobar_nombre(tfEditorial.getText().trim())
										&&comprobar_Genero(tfGenero.getText().trim())
											&&comprobar_fecha(tfFechaDeLanzamiento.getText().trim())
												//&&comprobar_precio(tfPrecio.getText().trim())
													//&&comprobar_precio(taDescripcion.getText().trim())
														&&comprobar_ISBN(tfISBN.getText().trim()))
			{
				/*if(rbtnTapaBlanda.isSelected()!= rbtnTapaDura.isSelected()) {
					System.out.println("yers");
				}{
					
				}*/
				System.out.println("ejjejejfjsfjsejfsjefsjsjej");
			}else {
				System.out.println("nope");
			}
		
			
		}
		});
		
		
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBackground(new Color(255, 140, 0));
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.fill = GridBagConstraints.VERTICAL;
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 3;
		gbc_btnModificar.gridy = 7;
		contentPane.add(btnModificar, gbc_btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(new Color(255, 0, 0));
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.fill = GridBagConstraints.VERTICAL;
		gbc_btnEliminar.ipadx = 7;
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 4;
		gbc_btnEliminar.gridy = 7;
		contentPane.add(btnEliminar, gbc_btnEliminar);
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 8;
		gbc_scrollPane_1.gridheight = 2;
		gbc_scrollPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 9;
		contentPane.add(scrollPane_1, gbc_scrollPane_1);
		
		tbLibros = new JTable();
		scrollPane_1.setViewportView(tbLibros);
		
		
		
	}
	
	
	private Boolean comprobar_nombre(String nbm_Libro) {
		String regex_nbm_Libro="^[a-zA-ZÀ-ÿ\u00f1\u00d1]+(\s[a-zA-ZÀ-ÿ\u00f1\u00d1])*[a-zA-ZÀ-ÿ\u00f1\u00d1]+$";
		return Pattern.matches(regex_nbm_Libro, nbm_Libro);
		
	}
	
	
	private Boolean comprobar_Autor(String autor_Libro) {
		String regex_autor_Libro="^[a-zA-ZÀ-ÿ\u00f1\u00d1]+(\s[a-zA-ZÀ-ÿ\u00f1\u00d1])*[a-zA-ZÀ-ÿ\u00f1\u00d1]+$";
		return Pattern.matches(regex_autor_Libro, autor_Libro);
		
	}
	
	private Boolean comprobar_Genero(String genero_Libro) {
		String regex_genero_Libro="^[a-zA-ZÀ-ÿ\u00f1\u00d1]+(\s[a-zA-ZÀ-ÿ\u00f1\u00d1])*[a-zA-ZÀ-ÿ\u00f1\u00d1]+$";
		return Pattern.matches(regex_genero_Libro, genero_Libro);
		
	}
	private Boolean comprobar_ISBN(String isbn_Libro) {
		String regex_isbn_Libro="[0-9]{13}$";
		return Pattern.matches(regex_isbn_Libro, isbn_Libro);
		
	}
	
	private Boolean comprobar_fecha(String fecha_Libro) {
		try {
			
	
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");

		String dateString = format.format( new Date()   );
		Date   date       = format.parse ( "31-12-2009" );   
		
		return true;
		}catch(NumberFormatException e) {
			return false;
		} catch (ParseException e) {
			return false;
		}
	}
	private Boolean comprobar_descripcion(String descripcion_Libro) {
		
			if (descripcion_Libro.length() > 199) {
				return true;
			}else {
				return false;
			}
		
	}
	
	private Boolean comprobar_precio(String precio) {
		try {
			
			Double.parseDouble(precio);
			return true;
			
		}catch(NumberFormatException e) {
			return false;
		}
		
	}

}

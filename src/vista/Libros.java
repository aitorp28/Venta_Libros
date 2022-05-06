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
import java.util.regex.Pattern;

import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.event.InputMethodListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;

public class Libros extends JFrame {

	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfAutor;
	private JTextField tfGenero;
	private JTextField tfEditorial;
	private JTextField tfFechaDeLanzamiento;
	private JTable table;
	private JCheckBox chTapaDura;
	private JCheckBox chTapaBlanda;
	private JLabel lblTituloLibros;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnCrear;
	private JLabel lblISBN;
	private JTextField tfISBN;

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
		setBounds(100, 100, 698, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 119, 118, 130, 155, 122, 0};
		gbl_contentPane.rowHeights = new int[]{59, 41, 46, 42, 0, 0, 64, 0, 110, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
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
		
		chTapaBlanda = new JCheckBox("Tapa Blanda");
		chTapaBlanda.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_chTapaBlanda = new GridBagConstraints();
		gbc_chTapaBlanda.insets = new Insets(0, 0, 5, 5);
		gbc_chTapaBlanda.gridx = 3;
		gbc_chTapaBlanda.gridy = 4;
		contentPane.add(chTapaBlanda, gbc_chTapaBlanda);
		
		chTapaDura = new JCheckBox("Tapa Dura");
		chTapaDura.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_chTapaDura = new GridBagConstraints();
		gbc_chTapaDura.insets = new Insets(0, 0, 5, 5);
		gbc_chTapaDura.gridx = 4;
		gbc_chTapaDura.gridy = 4;
		contentPane.add(chTapaDura, gbc_chTapaDura);
		
		btnCrear = new JButton("Crear");
		btnCrear.setBackground(new Color(50, 205, 50));
		GridBagConstraints gbc_btnCrear = new GridBagConstraints();
		gbc_btnCrear.ipadx = 15;
		gbc_btnCrear.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrear.gridx = 2;
		gbc_btnCrear.gridy = 5;
		contentPane.add(btnCrear, gbc_btnCrear);
		btnCrear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(comprobar_nombre(tfNombre.getText().trim())
						&&comprobar_Autor(tfAutor.getText().trim())
								&&comprobar_nombre(tfEditorial.getText().trim())
									&&comprobar_Genero(tfGenero.getText().trim())
										&&comprobar_fecha(tfFechaDeLanzamiento.getText().trim())
											&&comprobar_ISBN(tfISBN.getText().trim()));
				System.out.println(tfNombre.getText().trim());
				if(comprobar_nombre(tfNombre.getText().trim())) {
					System.out.println("fggggggggggggg");
				}else {
					System.out.println("ftghhhy");
				}
				
			}
		});
		
		
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBackground(new Color(255, 140, 0));
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.fill = GridBagConstraints.VERTICAL;
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 3;
		gbc_btnModificar.gridy = 5;
		contentPane.add(btnModificar, gbc_btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(new Color(255, 0, 0));
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.fill = GridBagConstraints.VERTICAL;
		gbc_btnEliminar.ipadx = 7;
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 4;
		gbc_btnEliminar.gridy = 5;
		contentPane.add(btnEliminar, gbc_btnEliminar);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridheight = 3;
		gbc_table.gridwidth = 6;
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 6;
		contentPane.add(table, gbc_table);
		
		
		
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
		String regex_isbn_Libro="/[0-9]{13}$/";
		return Pattern.matches(regex_isbn_Libro, isbn_Libro);
		
	}
	
	private Boolean comprobar_fecha(String fecha_Libro) {
		String regex_fecha_Libro="/^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$/";
		return Pattern.matches(regex_fecha_Libro, fecha_Libro);
		
	}

}

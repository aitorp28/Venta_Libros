package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tfNombre;
	private JPasswordField pfContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{85, 67, 179, 97, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 76, 0, 50, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblVentaLibros = new JLabel("VENTA LIBROS");
		lblVentaLibros.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblVentaLibros.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblVentaLibros = new GridBagConstraints();
		gbc_lblVentaLibros.insets = new Insets(0, 0, 5, 5);
		gbc_lblVentaLibros.gridx = 2;
		gbc_lblVentaLibros.gridy = 1;
		contentPane.add(lblVentaLibros, gbc_lblVentaLibros);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 2;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		tfNombre = new JTextField();
		GridBagConstraints gbc_tfNombre = new GridBagConstraints();
		gbc_tfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_tfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNombre.gridx = 2;
		gbc_tfNombre.gridy = 2;
		contentPane.add(tfNombre, gbc_tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		GridBagConstraints gbc_lblContrasena = new GridBagConstraints();
		gbc_lblContrasena.anchor = GridBagConstraints.EAST;
		gbc_lblContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasena.gridx = 1;
		gbc_lblContrasena.gridy = 3;
		contentPane.add(lblContrasena, gbc_lblContrasena);
		
		pfContrasena = new JPasswordField();
		GridBagConstraints gbc_pfContrasena = new GridBagConstraints();
		gbc_pfContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_pfContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_pfContrasena.gridx = 2;
		gbc_pfContrasena.gridy = 3;
		contentPane.add(pfContrasena, gbc_pfContrasena);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.anchor = GridBagConstraints.EAST;
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 5;
		contentPane.add(btnCancelar, gbc_btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.gridx = 3;
		gbc_btnAceptar.gridy = 5;
		contentPane.add(btnAceptar, gbc_btnAceptar);
	}

}

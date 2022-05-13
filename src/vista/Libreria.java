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

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.Canvas;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Scrollbar;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.Panel;
import javax.swing.ScrollPaneConstants;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;

public class Libreria extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Libreria frame = new Libreria();
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
	public Libreria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		
		
		Panel panel = new Panel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 3;
		contentPane.add(panel, gbc_panel);
		
		JScrollPane scrollPane = new JScrollPane(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {0};
		gbl_panel.rowHeights = new int[] {0};
		gbl_panel.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 12;
		gbc_scrollPane.gridheight = 9;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		for(int j = 0 ; j< 10 ; j++) {
			
		
		
			for(int i = 0 ; i <4;i++) {
			
				Icon icon1 = new ImageIcon("C:/Users/Ik_jav/Pictures/Captura.PNG");
				
				
				JLabel paco = new JLabel("New label"+i,icon1, SwingConstants.CENTER);
				
				paco.setHorizontalTextPosition(JLabel.CENTER);
				paco.setVerticalTextPosition(JLabel.BOTTOM);
				GridBagConstraints gbc_lblLibro1 = new GridBagConstraints();
				gbc_lblLibro1.insets = new Insets(0, 0, 5, 5);
				gbc_lblLibro1.gridx = 2+i;
				gbc_lblLibro1.gridy = 3+j;
	
				panel.add(paco, gbc_lblLibro1);
			
			}
			
			
		
		
		}
		/*JLabel lblLibro2 = new JLabel("New label");
		GridBagConstraints gbc_lblLibro2 = new GridBagConstraints();
		gbc_lblLibro2.insets = new Insets(0, 0, 5, 5);
		gbc_lblLibro2.gridx = 4;
		gbc_lblLibro2.gridy = 3;
		contentPane.add(lblLibro2, gbc_lblLibro2);
		
		JLabel lblLibro3 = new JLabel("New label");
		GridBagConstraints gbc_lblLibro3 = new GridBagConstraints();
		gbc_lblLibro3.insets = new Insets(0, 0, 5, 5);
		gbc_lblLibro3.gridx = 6;
		gbc_lblLibro3.gridy = 3;
		contentPane.add(lblLibro3, gbc_lblLibro3);
		
		JLabel lblLibro4 = new JLabel("New label");
		GridBagConstraints gbc_lblLibro4 = new GridBagConstraints();
		gbc_lblLibro4.insets = new Insets(0, 0, 5, 5);
		gbc_lblLibro4.gridx = 8;
		gbc_lblLibro4.gridy = 3;
		contentPane.add(lblLibro4, gbc_lblLibro4);*/
	}

}

package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JTable;

public class VentanaAdmin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAdmin frame = new VentanaAdmin();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
	public VentanaAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1147, 689);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pSuperior = new JPanel();
		pSuperior.setBackground(new Color(255, 128, 128));
		pSuperior.setBounds(0, 0, 1550, 68);
		contentPane.add(pSuperior);
		pSuperior.setLayout(null);
		
		JLabel lblTitulo = new JLabel("GESTOR ADMININSTRATIVO");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBackground(new Color(255, 128, 128));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitulo.setBounds(10, -2, 436, 36);
		pSuperior.add(lblTitulo);
		
		JMenuItem mntmNewAdmin = new JMenuItem("Añadir Adminsitrador");
		mntmNewAdmin.setBackground(new Color(255, 128, 128));
		mntmNewAdmin.setForeground(new Color(255, 255, 255));
		mntmNewAdmin.setBounds(20, 44, 170, 24);
		pSuperior.add(mntmNewAdmin);
		
		JMenuItem mntmCargarCSV = new JMenuItem("Cargar CSV");
		mntmCargarCSV.setBackground(new Color(255, 128, 128));
		mntmCargarCSV.setForeground(new Color(255, 255, 255));
		mntmCargarCSV.setBounds(268, 44, 133, 24);
		pSuperior.add(mntmCargarCSV);
		
		JPanel pCentro = new JPanel();
		pCentro.setBackground(new Color(255, 255, 255));
		pCentro.setBounds(0, 69, 1133, 583);
		contentPane.add(pCentro);
		pCentro.setLayout(null);
	}
}

package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane, panelMain;
	private static VentanaPrincipal instance;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1134, 842);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelMain = new JPanel();
		panelMain.setBackground(new Color(255, 255, 255));
		panelMain.setBounds(0, 0, 1314, 883);
		contentPane.add(panelMain);
		panelMain.setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(255, 128, 128));
		panelMenu.setBounds(0, 0, 209, 821);
		panelMain.add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel lblTitulo = new JLabel("CryptoStats");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBackground(new Color(255, 128, 128));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTitulo.setBounds(20, 15, 167, 58);
		panelMenu.add(lblTitulo);
		
		JMenuItem mntmAdmin = new JMenuItem("Administrdor");
		mntmAdmin.setBackground(new Color(255, 128, 128));
		mntmAdmin.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmAdmin.setForeground(new Color(255, 255, 255));
		mntmAdmin.setBounds(20, 94, 167, 29);
		panelMenu.add(mntmAdmin);
		
		JLabel lblBienvenido = new JLabel("<html><b>Bienvenido a CryptoStats! </b><br><br> Para poder realizar alguna consulta <br> debe ser usuario de nuestra página.</html>");
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBienvenido.setBounds(403, 194, 423, 220);
		panelMain.add(lblBienvenido);
		
		JButton btnCrearUs = new JButton("Crear Usuario");
		btnCrearUs.setBackground(new Color(255, 255, 255));
		btnCrearUs.setBounds(403, 433, 133, 21);
		panelMain.add(btnCrearUs);
		
		JButton btnIniSes = new JButton("Iniciar Sesion");
		btnIniSes.setBackground(new Color(255, 255, 255));
		btnIniSes.setBounds(558, 433, 133, 21);
		panelMain.add(btnIniSes);
		
		btnIniSes.addActionListener(new ActionListener(){

			@Override
		public void actionPerformed(ActionEvent e) {
			VentanaIniSes vis = new VentanaIniSes();
			vis.setVisible(true);
				
			}
			
		});
		btnCrearUs.addActionListener(new ActionListener(){

			@Override
		public void actionPerformed(ActionEvent e) {
			VentanaCrearUs vcu = new VentanaCrearUs();
			vcu.setVisible(true);
				
			}
			
		});
		
		mntmAdmin.addActionListener(new ActionListener(){

			@Override
		public void actionPerformed(ActionEvent e) {
			VentanaIniSesAdmin vcu = new VentanaIniSesAdmin();
			vcu.setVisible(true);
				
			}
			
		});

	}
	

	public static VentanaPrincipal getInstance() {
	  if (instance == null) {
	    instance = new VentanaPrincipal();
	  }
	  return instance;
	}
	
	public void setPanelMain(JPanel panel) {
		  panelMain = panel;
		}

		public JPanel getPanelMain() {
		  return panelMain;
		}
	
	
}

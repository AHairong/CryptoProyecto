package gui;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class VentanaInicioSes extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane, panelCentro, panelSur;
	public static JTextField textFieldUsuario;
	private JButton btnExit, btnIniciarSesion;
	public static JLabel lblContrasenia, lblUsuario;
	private JPasswordField passwordFieldContrasenia;
	private JFrame VentanaInicioSes;
	private Connection con;
	public static String uCon; //este atributo es la contraseña del usuario, que la coje en btnIncioSesion
	public static String usu;//este atributo es el usuario
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicioSes frame = new VentanaInicioSes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public VentanaInicioSes() {
		
		

		
	}

}

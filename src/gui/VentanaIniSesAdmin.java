package gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaIniSesAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomUs;
	private JTextField textFieldPassw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaIniSesAdmin frame = new VentanaIniSesAdmin();
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
	public VentanaIniSesAdmin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Inicio de sesión como usuario");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitulo.setBounds(22, 23, 162, 19);
		contentPane.add(lblTitulo);
		
		JLabel lblNomUs = new JLabel("Nombre de usuario:");
		lblNomUs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomUs.setBounds(22, 94, 120, 13);
		contentPane.add(lblNomUs);
		
		JLabel lblPassw = new JLabel("Contraseña:");
		lblPassw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassw.setBounds(22, 140, 100, 13);
		contentPane.add(lblPassw);
		
		textFieldNomUs = new JTextField();
		textFieldNomUs.setBounds(163, 92, 148, 19);
		contentPane.add(textFieldNomUs);
		textFieldNomUs.setColumns(10);
		
		textFieldPassw = new JTextField();
		textFieldPassw.setBounds(163, 138, 148, 19);
		contentPane.add(textFieldPassw);
		textFieldPassw.setColumns(10);
		
		JButton btnIniSes = new JButton("Iniciar sesión");
		btnIniSes.setBounds(307, 232, 119, 21);
		contentPane.add(btnIniSes);
		
		btnIniSes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
		   }
		});
			
		

		
		
		
	}

}


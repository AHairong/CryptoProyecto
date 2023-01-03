package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCrearUs extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNom;
	private JTextField textFieldEmail;
	private JPasswordField passwField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCrearUs frame = new VentanaCrearUs();
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
	public VentanaCrearUs() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNom = new JLabel("Nombre:");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNom.setBounds(41, 81, 64, 13);
		contentPane.add(lblNom);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setBounds(41, 117, 45, 13);
		contentPane.add(lblEmail);
		
		JLabel lblPassw = new JLabel("Contraseña:");
		lblPassw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassw.setBounds(41, 151, 78, 13);
		contentPane.add(lblPassw);
		
		JLabel lblCrearUS = new JLabel("Crea un usuario");
		lblCrearUS.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCrearUS.setBounds(41, 24, 152, 20);
		contentPane.add(lblCrearUS);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(129, 79, 130, 19);
		contentPane.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(129, 115, 130, 19);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		passwField = new JPasswordField();
		passwField.setBounds(129, 149, 130, 19);
		contentPane.add(passwField);
		
		JButton btnConfCrear = new JButton("Crear Usuario");
		btnConfCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfCrear.setBounds(288, 232, 115, 21);
		contentPane.add(btnConfCrear);
	}
}

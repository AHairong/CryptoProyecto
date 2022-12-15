package gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;


public class ventanaPrincipal extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JFrame ventanaPrincipal;
	private JButton admin;
	private JPanel contentPane, panelCentro;
	private static Logger logger = Logger.getLogger(ventanaPrincipal.class.getName());
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal frame = new ventanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public ventanaPrincipal() {
		
		ventanaPrincipal = this;
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		setExtendedState(MAXIMIZED_BOTH);
		setTitle("PROTECTORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setForeground(Color.WHITE);
		panelCentro = new JPanel();
		panelCentro.setLayout(new GridLayout(0, 2));
		
		
		
	}
	
	
	
	

	
	
}
package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ToolTipManager;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class VentanaCliente extends JFrame {

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
					VentanaCliente frame = new VentanaCliente();
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
	public VentanaCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1220, 690);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 128));
		panel.setBounds(0, 0, 1206, 89);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("CryptoStats");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTitulo.setBounds(21, 10, 168, 69);
		panel.add(lblTitulo);
		
		JPanel pMenu = new JPanel();
		pMenu.setBackground(new Color(255, 128, 128));
		pMenu.setBounds(0, 120, 1206, 50);
		contentPane.add(pMenu);
		pMenu.setLayout(null);
		
		JLabel lblFiltro = new JLabel("Filtro:");
		lblFiltro.setBackground(new Color(255, 128, 128));
		lblFiltro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFiltro.setForeground(new Color(255, 255, 255));
		lblFiltro.setBounds(10, 10, 66, 30);
		pMenu.add(lblFiltro);
		
		JLabel lblMon = new JLabel("Moneda");
		lblMon.setBackground(new Color(255, 255, 255));
		lblMon.setForeground(new Color(255, 255, 255));
		lblMon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMon.setBounds(86, 18, 54, 19);
		pMenu.add(lblMon);
		
		JButton btnStart = new JButton("COMENZAR");
		btnStart.setToolTipText("RaceChart histórico");
		btnStart.setBackground(new Color(255, 255, 255));
		btnStart.setBounds(1050, 13, 111, 28);
		pMenu.add(btnStart);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(183, 18, 104, 19);
		pMenu.add(comboBox);
		
		JPanel pCentro = new JPanel();
		pCentro.setBackground(new Color(255, 255, 255));
		pCentro.setBounds(0, 173, 1206, 480);
		contentPane.add(pCentro);
	}

}

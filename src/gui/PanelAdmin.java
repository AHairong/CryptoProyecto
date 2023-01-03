package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JButton;

public class PanelAdmin extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelAdmin() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 128));
		panel.setBounds(10, 10, 798, 81);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GESTOR DEL ADMINSITRADOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBackground(new Color(255, 128, 128));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 10, 409, 73);
		panel.add(lblNewLabel);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setBounds(10, 167, 798, 418);
		add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(791, 167, 17, 48);
		add(scrollBar);
		
		JButton btnCargarCSV = new JButton(" Cargar CSV");
		btnCargarCSV.setBounds(10, 122, 102, 21);
		add(btnCargarCSV);
		
		JButton btnNuevoAdmin = new JButton("Nuevo Admin");
		btnNuevoAdmin.setBackground(new Color(255, 255, 255));
		btnNuevoAdmin.setBounds(136, 122, 102, 21);
		add(btnNuevoAdmin);

	}
}

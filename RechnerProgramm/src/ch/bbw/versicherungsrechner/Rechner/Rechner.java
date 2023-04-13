package ch.bbw.versicherungsrechner.Rechner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rechner extends JPanel implements ActionListener {
	private JLabel output = new JLabel("Ihre Schadensersatzsumme beträgt: ");
	private JTextField damageAmount = new JTextField();
	public Rechner(){
		JFrame frame = new JFrame("Schadensrechner");
		JPanel panel = new JPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(192, 108);
		frame.add(panel);
		
		panel.setSize(192, 108);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
}

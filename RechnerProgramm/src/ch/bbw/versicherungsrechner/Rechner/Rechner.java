package ch.bbw.versicherungsrechner.Rechner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class Rechner extends JPanel implements ActionListener {
	public Rechner(){
		JFrame frame = new JFrame("Schadensrechner");
		JPanel versSumme = new JPanel();
		JPanel quadratMeterModell = new JPanel();
		JLabel damageDesc = new JLabel("Geben Sie hier ihre Schadenssumme ein");
		JTextField damageAmount = new JTextField();
		JLabel sumDesc = new JLabel("Geben Sie hier Ihre Versicherungssumme ein");
		JTextField sumAmount = new JTextField();
		JLabel output = new JLabel("Ihre Schadensersatzsumme beträgt: ");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(640, 360);
		
		versSumme.setVisible(true);
		versSumme.setLayout(new BoxLayout(versSumme, BoxLayout.Y_AXIS));
		versSumme.add(damageDesc);
		versSumme.add(damageAmount);
		versSumme.add(sumDesc);
		versSumme.add(sumAmount);
		versSumme.add(output);
		
		frame.add(versSumme);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
}

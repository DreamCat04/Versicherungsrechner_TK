package ch.bbw.versicherungsrechner.Rechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class Rechner extends JPanel implements ActionListener {
	public Rechner(){
		JFrame frame = new JFrame("Schadensrechner");
		JPanel versSummeModell = new JPanel();
		JPanel quadratMeterModell = new JPanel();
		JLabel damageDesc = new JLabel("Geben Sie hier ihre Schadenssumme ein");
		JTextField damageAmount = new JTextField();
		JLabel insuranceAmountDesc = new JLabel("Geben Sie hier den Versicherungswert Ihres Hauses ein");
		JTextField insuranceAmount = new JTextField();
		JLabel sumDesc = new JLabel("Geben Sie hier Ihre Versicherungssumme ein");
		JTextField sumAmount = new JTextField();
		JLabel insurancePayout = new JLabel("Ihre Schadensersatz beträgt: ");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(640, 360);
		frame.add(versSummeModell);
		
		versSummeModell.setVisible(true);
		versSummeModell.setLayout(new BoxLayout(versSummeModell, BoxLayout.PAGE_AXIS));
		versSummeModell.add(damageDesc);
		versSummeModell.add(damageAmount);
		versSummeModell.add(insuranceAmountDesc);
		versSummeModell.add(insuranceAmount);
		versSummeModell.add(sumDesc);
		versSummeModell.add(sumAmount);
		versSummeModell.add(insurancePayout);
		
		damageAmount.setMaximumSize(new Dimension(640, 50));
		sumAmount.setMaximumSize(new Dimension(640, 50));
		insuranceAmount.setMaximumSize(new Dimension(640, 50));
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
}

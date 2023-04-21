package ch.bbw.versicherungsrechner.Rechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class VersicherungsSummenModell implements ActionListener {
	JFormattedTextField enterDamageAmount = new JFormattedTextField(NumberFormat.getIntegerInstance());
	JFormattedTextField enterHouseValue = new JFormattedTextField(NumberFormat.getIntegerInstance());
	JFormattedTextField enterInsuranceSum = new JFormattedTextField(NumberFormat.getIntegerInstance());
	JFormattedTextField payoutAmount = new JFormattedTextField();
	JLabel insurancePayout = new JLabel("Ihr Schadensersatz beträgt: ");
	JLabel damageDesc = new JLabel("Ihre Schadenssumme:");
	JLabel houseValueDesc = new JLabel("Der Hausratswert Ihres Hauses:");
	JLabel sumDesc = new JLabel("Ihre Versicherungssumme ein:");
	JButton submit = new JButton("Schadensersatz berechnen!");
	JButton toQuadratMeterModell = new JButton("Zum Quadratmetermodell");
	
	public VersicherungsSummenModell() {
	
	}
	public void draw() {
		JFrame frame = new JFrame("Schadensrechner");
		JPanel versSummeModell = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(640, 360);
		frame.add(versSummeModell);
		
		versSummeModell.setVisible(true);
		versSummeModell.setLayout(new BoxLayout(versSummeModell, BoxLayout.PAGE_AXIS));
		versSummeModell.add(toQuadratMeterModell);
		versSummeModell.add(damageDesc);
		versSummeModell.add(enterDamageAmount);
		versSummeModell.add(houseValueDesc);
		versSummeModell.add(enterHouseValue);
		versSummeModell.add(sumDesc);
		versSummeModell.add(enterInsuranceSum);
		versSummeModell.add(submit);
		versSummeModell.add(insurancePayout);
		versSummeModell.add(payoutAmount);
		
		enterDamageAmount.setSize(new Dimension(500, 50));
		enterInsuranceSum.setSize(new Dimension(640, 50));
		enterHouseValue.setSize(new Dimension(640, 50));
		payoutAmount.setSize(new Dimension(640, 50));
		submit.addActionListener(this);
		toQuadratMeterModell.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		int damageAmount = Integer.parseInt(enterDamageAmount.getText());
		int houseValue = Integer.parseInt(enterHouseValue.getText());
		int insuranceSum = Integer.parseInt(enterInsuranceSum.getText());
		if(insuranceSum > houseValue) {
			payoutAmount.setText(String.valueOf(damageAmount));
		} else if (damageAmount > houseValue) {
			payoutAmount.setText("Sie können nicht mehr Schaden haben, als Ihr Haus aktuell Wert ist!");
		} else {
			double payout = Math.floor((double) insuranceSum / houseValue * damageAmount);
			payoutAmount.setText(String.valueOf(payout));
		}
	}
}

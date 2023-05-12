package ch.bbw.versicherungsrechner.Rechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class VersicherungsSummenModell {
	JFormattedTextField enterDamageAmount = new JFormattedTextField(NumberFormat.getIntegerInstance());
	JFormattedTextField enterHouseValue = new JFormattedTextField(NumberFormat.getIntegerInstance());
	JFormattedTextField enterInsuranceSum = new JFormattedTextField(NumberFormat.getIntegerInstance());
	JTextField payoutAmount = new JTextField();
	JLabel insurancePayout = new JLabel("Ihr Schadensersatz beträgt: ");
	JLabel damageDesc = new JLabel("Ihre Schadenssumme:");
	JLabel houseValueDesc = new JLabel("Der Hausratswert Ihres Hauses:");
	JLabel sumDesc = new JLabel("Ihre Versicherungssumme:");
	JButton submit = new JButton("Schadensersatz berechnen!");
	JButton switchToQuadratMeterModell = new JButton("Zum Quadratmetermodell");
	boolean isSwitchButtonPressed = false;
	JFrame frame = new JFrame("Schadensrechner"); //Frame ist für Fenster, Panel ist das, was in diesem Fenster ist.
	JPanel versSummeModell = new JPanel();
	ImageIcon hausImage = new ImageIcon("/img/Haus.jpeg");
	JLabel imageContainer = new JLabel(hausImage);
	
	public void draw() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(640, 360);
		frame.add(versSummeModell);
		frame.setLocation(480, 270);
		
		versSummeModell.setVisible(true);
		versSummeModell.setLayout(new BoxLayout(versSummeModell, BoxLayout.PAGE_AXIS));
		versSummeModell.add(switchToQuadratMeterModell);
		versSummeModell.add(damageDesc);
		versSummeModell.add(enterDamageAmount);
		versSummeModell.add(houseValueDesc);
		versSummeModell.add(enterHouseValue);
		versSummeModell.add(sumDesc);
		versSummeModell.add(enterInsuranceSum);
		versSummeModell.add(submit);
		versSummeModell.add(insurancePayout);
		versSummeModell.add(payoutAmount);
		versSummeModell.add(imageContainer);
		
		enterDamageAmount.setSize(new Dimension(500, 50));
		enterInsuranceSum.setSize(new Dimension(640, 50));
		enterHouseValue.setSize(new Dimension(640, 50));
		payoutAmount.setSize(new Dimension(640, 50));
		
		imageContainer.setSize(100, 100);
		submit.addActionListener(e -> {
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
		});
		switchToQuadratMeterModell.addActionListener(e -> isSwitchButtonPressed = true);
	}
	public void delete() {
		frame.dispose();
	}
}

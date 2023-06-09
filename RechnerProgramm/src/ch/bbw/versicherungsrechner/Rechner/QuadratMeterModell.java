package ch.bbw.versicherungsrechner.Rechner;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class QuadratMeterModell {
	JFrame frame = new JFrame("Schadensrechner");
	JPanel quaMeterModell = new JPanel();
	JLabel damagedAreaDesc = new JLabel("Die Fläche Ihres Hauses, die zerstört wurde:");
	JFormattedTextField enterDamagedArea = createDamageField();
	JLabel totalHouseAreaDesc = new JLabel("Die Gesamtfläche Ihres Hauses:");
	JFormattedTextField enterTotalHouseArea = createAreaField();
	JLabel pricePerSquareMeterDesc = new JLabel("Der Durchschnittspreis pro Quadratmeter:");
	JFormattedTextField enterPricePerSquareMeter = createPriceField();
	JButton submit = new JButton("Schadensersatz berechnen!");
	JLabel insurancePayout = new JLabel("Ihr Schadensersatz beträgt: ");
	JTextField payoutAmount = new JTextField();
	JButton switchToVersSummModell = new JButton("Zum Versicherungssummenmodell");
	boolean isSwitchButtonPressed = false;
	
	public void draw(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(640, 360);
		frame.add(quaMeterModell);
		frame.setLocation(480, 270);
		
		quaMeterModell.setVisible(true);
		quaMeterModell.setLayout(new BoxLayout(quaMeterModell, BoxLayout.PAGE_AXIS));
		quaMeterModell.add(switchToVersSummModell);
		quaMeterModell.add(damagedAreaDesc);
		quaMeterModell.add(enterDamagedArea);
		quaMeterModell.add(totalHouseAreaDesc);
		quaMeterModell.add(enterTotalHouseArea);
		quaMeterModell.add(pricePerSquareMeterDesc);
		quaMeterModell.add(enterPricePerSquareMeter);
		quaMeterModell.add(submit);
		quaMeterModell.add(insurancePayout);
		quaMeterModell.add(payoutAmount);
		
		enterDamagedArea.setSize(new Dimension(500, 50));
		enterTotalHouseArea.setSize(new Dimension(640, 50));
		enterPricePerSquareMeter.setSize(new Dimension(640, 50));
		payoutAmount.setSize(new Dimension(640, 50));
		
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int damagedArea = Integer.parseInt(enterDamagedArea.getText());
				int houseArea = Integer.parseInt(enterTotalHouseArea.getText());
				int pricePerSquareMeter = Integer.parseInt(enterPricePerSquareMeter.getText());
				int houseValue = houseArea * pricePerSquareMeter;
				int damageAmount = damagedArea * pricePerSquareMeter;
				if (damageAmount < houseValue) {
					payoutAmount.setText(String.valueOf(damageAmount));
				} else {
					payoutAmount.setText("Es ist nicht möglich, dass mehr Fläche zerstört wurde, als in Ihrem Haus vorhanden ist!");
				}
			}
		});
		switchToVersSummModell.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setSwitchButtonPressed(true);
			}
		});
	}
	
	public void setSwitchButtonPressed(boolean switchButtonPressed) {
		isSwitchButtonPressed = switchButtonPressed;
	}
	
	public void delete(){
		frame.dispose();
	}
	JFormattedTextField createDamageField(){
		NumberFormat format = NumberFormat.getIntegerInstance();
		format.setGroupingUsed(false); // Disable grouping separators
		
		NumberFormatter formatter = new NumberFormatter(format);
		formatter.setValueClass(Integer.class);
		formatter.setAllowsInvalid(false);
		formatter.setMinimum(0);
		
		JFormattedTextField textField = new JFormattedTextField(formatter);
		textField.setColumns(10);
		
		return textField;
	}
	JFormattedTextField createAreaField(){
		NumberFormat format = NumberFormat.getIntegerInstance();
		format.setGroupingUsed(false); // Disable grouping separators
		
		NumberFormatter formatter = new NumberFormatter(format);
		formatter.setValueClass(Integer.class);
		formatter.setAllowsInvalid(false);
		formatter.setMinimum(0);
		
		JFormattedTextField textField = new JFormattedTextField(formatter);
		textField.setColumns(10);
		
		return textField;
	}
	JFormattedTextField createPriceField(){
		NumberFormat format = NumberFormat.getIntegerInstance();
		format.setGroupingUsed(false); // Disable grouping separators
		
		NumberFormatter formatter = new NumberFormatter(format);
		formatter.setValueClass(Integer.class);
		formatter.setAllowsInvalid(false);
		formatter.setMinimum(0);
		
		JFormattedTextField textField = new JFormattedTextField(formatter);
		textField.setColumns(10);
		
		return textField;
	}
}

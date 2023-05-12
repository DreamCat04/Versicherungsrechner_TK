package ch.bbw.versicherungsrechner.Rechner;

import javax.swing.*;
import java.awt.*;

public class StartScreen {
	JLabel label = new JLabel("Welches Modell möchten Sie benutzen?");
	JButton zuVersSummeModell = new JButton("Versicherungssummenmodell");
	JButton zuQuaMeterModell = new JButton("Quadratmetermodell");
	JFrame frame = new JFrame("Schadensrechner");
	JPanel startScreen = new JPanel();
	public void draw(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(640, 360);
		frame.add(startScreen);
		frame.setLocation(480, 270);
		
		startScreen.setLayout(new BoxLayout(startScreen, BoxLayout.Y_AXIS));
		startScreen.setVisible(true);
		startScreen.add(label);
		startScreen.add(zuVersSummeModell);
		startScreen.add(zuQuaMeterModell);
		
		label.setSize(650, 50);
		zuVersSummeModell.setSize(new Dimension(250, 50));
		zuQuaMeterModell.setSize(new Dimension(300, 50));
		
		label.setLocation(200, 50);
		zuVersSummeModell.setLocation(200, 100);
		zuQuaMeterModell.setLocation(200, 150);
	}
	public void delete(){
		frame.dispose();
	}
}

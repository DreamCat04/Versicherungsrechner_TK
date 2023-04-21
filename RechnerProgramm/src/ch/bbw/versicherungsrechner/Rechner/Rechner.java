package ch.bbw.versicherungsrechner.Rechner;

import javax.swing.*;

public class Rechner {
	
	public Rechner(){
		VersicherungsSummenModell versSummeModell = new VersicherungsSummenModell();
		QuadratMeterModell quaMeterModell = new QuadratMeterModell();
		versSummeModell.draw();
		while (true){
			if (versSummeModell.isSwitchButtonPressed){
				versSummeModell.delete();
				quaMeterModell.draw();
				versSummeModell.isSwitchButtonPressed = false;
			} else if (quaMeterModell.isSwitchButtonPressed){
				quaMeterModell.delete();
				versSummeModell.draw();
				quaMeterModell.isSwitchButtonPressed = false;
			}
		}
	}
}

package ch.bbw.versicherungsrechner.Rechner;

import javax.swing.*;

public class Rechner {
	
	public Rechner(){ //TODO: "Navbar" einfügen und machen, sodass man zwischen den beiden Rechnern wechseln kann
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

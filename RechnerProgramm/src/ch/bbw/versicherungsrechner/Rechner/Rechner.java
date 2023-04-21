package ch.bbw.versicherungsrechner.Rechner;

import javax.swing.*;

public class Rechner extends JPanel {
	
	public Rechner(){ //TODO: "Navbar" einfügen und machen, sodass man zwischen den beiden Rechnern wechseln kann
		VersicherungsSummenModell versSummeModell = new VersicherungsSummenModell();
		versSummeModell.draw();
	}
	
}

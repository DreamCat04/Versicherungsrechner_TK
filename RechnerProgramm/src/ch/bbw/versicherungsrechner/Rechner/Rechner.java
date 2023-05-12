package ch.bbw.versicherungsrechner.Rechner;

public class Rechner {
	
	public Rechner(){
		VersicherungsSummenModell versSummeModell = new VersicherungsSummenModell();
		QuadratMeterModell quaMeterModell = new QuadratMeterModell();
		versSummeModell.draw();
		while (true){
			if (versSummeModell.isSwitchButtonPressed){
				versSummeModell.isSwitchButtonPressed = false;
				versSummeModell.delete();
				quaMeterModell.draw();
			} else if (quaMeterModell.isSwitchButtonPressed){
				quaMeterModell.isSwitchButtonPressed = false;
				quaMeterModell.delete();
				versSummeModell.draw();
			}
		}
	}
}

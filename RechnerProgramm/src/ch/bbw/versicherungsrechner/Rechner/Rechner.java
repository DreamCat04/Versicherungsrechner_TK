package ch.bbw.versicherungsrechner.Rechner;

public class Rechner {
	
	public static void main(String[] args) {
		StartScreen startScreen = new StartScreen();
		VersicherungsSummenModell versSummeModell = new VersicherungsSummenModell();
		QuadratMeterModell quaMeterModell = new QuadratMeterModell();
		startScreen.draw();//TODO: durch startscreen ersetzen und richtigen Check einfügen
		
		startScreen.zuVersSummeModell.addActionListener(e -> {
			startScreen.delete();
			versSummeModell.draw();
		});
		startScreen.zuQuaMeterModell.addActionListener(e -> {
			startScreen.delete();
			quaMeterModell.draw();
		});
		
		quaMeterModell.switchToVersSummModell.addActionListener(e -> {
			quaMeterModell.delete();
			versSummeModell.draw();
		});
		versSummeModell.switchToQuadratMeterModell.addActionListener(e -> {
			versSummeModell.delete();
			quaMeterModell.draw();
		});
	}
}

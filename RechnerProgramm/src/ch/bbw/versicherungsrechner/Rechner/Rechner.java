package ch.bbw.versicherungsrechner.Rechner;

public class Rechner {
	
	public static void main(String[] args) {
		VersicherungsSummenModell versSummeModell = new VersicherungsSummenModell();
		QuadratMeterModell quaMeterModell = new QuadratMeterModell();
		versSummeModell.draw();
		
		quaMeterModell.switchToVersSummModell.addActionListener(e -> {
			quaMeterModell.frame.dispose();
			quaMeterModell.delete();
			versSummeModell.draw();
		});
		versSummeModell.switchToQuadratMeterModell.addActionListener(e -> {
			versSummeModell.frame.dispose();
			versSummeModell.delete();
			quaMeterModell.draw();
		});
	}
}

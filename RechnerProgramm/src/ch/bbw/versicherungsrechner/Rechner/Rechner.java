package ch.bbw.versicherungsrechner.Rechner;

public class Rechner {
	
	public static void main(String[] args) {
		VersicherungsSummenModell versSummeModell = new VersicherungsSummenModell();
		QuadratMeterModell quaMeterModell = new QuadratMeterModell();
		versSummeModell.draw();
		
		quaMeterModell.switchToVersSummModell.addActionListener(e -> {
			quaMeterModell.frame.dispose(); // Close current window
			quaMeterModell.delete();
			versSummeModell.draw(); // Show VersicherungsSummenModell window
		});
		
		// Action listener for switchToQuaMeterModell button in VersicherungsSummenModell
		versSummeModell.switchToQuadratMeterModell.addActionListener(e -> {
			versSummeModell.frame.dispose(); // Close current window
			versSummeModell.delete();
			quaMeterModell.draw(); // Show QuadratMeterModell window
		});
		/*
		while (true){
			if (versSummeModell.isSwitchButtonPressed){
				System.out.println("switch button 1 was pressed");
				versSummeModell.delete();
				quaMeterModell.draw();
				versSummeModell.setSwitchButtonPressed(false);
			} else if (quaMeterModell.isSwitchButtonPressed){
				System.out.println("switch button 2 was pressed");
				quaMeterModell.delete();
				versSummeModell.draw();
				quaMeterModell.setSwitchButtonPressed(false);
			}
		}*/
	}
}

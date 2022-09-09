package innlevering;

import javax.swing.JOptionPane;

public class OppgaveB5 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String utskrift = "";
			int poengsum = 0;
			boolean gyldigTall = false;
			while (!gyldigTall) {
				poengsum = Integer.parseInt(JOptionPane.showInputDialog("Hva er din poengsum: "));
				if (poengsum < 0 || poengsum > 100) {
					JOptionPane.showMessageDialog(null,"Ugyldig poengsum!");
				} else {
					gyldigTall = true;
				}
			}
			if (poengsum < 40) {
				utskrift = "F";
			} else if (poengsum >= 40 && poengsum <= 49) {
				utskrift = "E";
			} else if (poengsum >= 50 && poengsum <= 59) {
				utskrift = "D";
			} else if (poengsum >= 60 && poengsum <= 79) {
				utskrift = "C";
			} else if (poengsum >= 80 && poengsum <= 89) {
				utskrift = "B";
			} else if (poengsum >= 90) {
				utskrift = "A";
			}
			JOptionPane.showMessageDialog(null,utskrift);
		}
	
	}

}

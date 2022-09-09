package innlevering;

import javax.swing.JOptionPane;

public class OppgaveO3 {

	public static void main(String[] args) {
		int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv et tall: "));
		int resultat = 1;
		for(int i = tall; i > 0; i--) {
			resultat = resultat*i;
		}
		JOptionPane.showMessageDialog(null,tall + " fakultet = " + resultat);
	}

}

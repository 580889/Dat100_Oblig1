package innlevering;
import javax.swing.JOptionPane;

public class OppgaveB4 {

	public static void main(String[] args) {
		int brutto = Integer.parseInt(JOptionPane.showInputDialog("Hva er din bruttolønn: "));
		double trinnSkatt = 0.0;
		if (brutto <= 164100) {
			trinnSkatt = 0.0;
		} else if (brutto > 164100 && brutto <= 230950) {
			trinnSkatt = brutto*0.0093; 
		} else if (brutto > 230950 && brutto <= 580650) {
			trinnSkatt = brutto*0.0241; 
		} else if (brutto > 580650 && brutto <= 934050) {
			trinnSkatt = brutto*0.1152; 
		} else if (brutto > 934050) {
			trinnSkatt = brutto*0.1452; 
		}
		JOptionPane.showMessageDialog(null, "Trinnskatt: " + trinnSkatt + "kr");
	}
}

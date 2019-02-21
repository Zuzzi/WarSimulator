import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ListenerRisultato implements ActionListener {

	static GUIsalvataggio salvataggio;

	void addListener(JButton c) {
		c.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object sorgente = e.getSource();

		if (sorgente == GUIrisultato.menu) {

			WarSimulator.menu.setVisible(true);

			ListenerStrategia.simulazione.setVisible(false);
			ListenerSimulazione.risultato.setVisible(false);

		}

		else if (sorgente == GUIrisultato.salva) {

			salvataggio = new GUIsalvataggio();
			salvataggio.creaSalvataggio();

			ListenerStrategia.simulazione.setVisible(false);
			ListenerSimulazione.risultato.setVisible(false);

		}

	}

	void infoBox(String infoMessage, String location) {
		JOptionPane.showMessageDialog(null, infoMessage, "" + location, JOptionPane.INFORMATION_MESSAGE);
	}

}

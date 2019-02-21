
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ListenerPopolo implements ActionListener {

	static GUIgeneraleRoma generaleRoma;
	static GUIgeneraleEuropa generaleEuropa;
	static GUIgeneraleGiappone generaleGiappone;

	void addListener(JButton c) {
		c.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object sorgente = e.getSource();

		if (sorgente == GUIpopolo.roma) {

			Globali.giocatore.popolo = "Roma";

			generaleRoma = new GUIgeneraleRoma();
			generaleRoma.creaGeneraleRoma();

			ListenerMenu.popolo.setVisible(false);

		}

		else if (sorgente == GUIpopolo.europa) {

			Globali.giocatore.popolo = "Europa";

			generaleEuropa = new GUIgeneraleEuropa();
			generaleEuropa.creaGeneraleEuropa();

			ListenerMenu.popolo.setVisible(false);

		}

		else if (sorgente == GUIpopolo.giappone) {

			Globali.giocatore.popolo = "Giappone";

			generaleGiappone = new GUIgeneraleGiappone();
			generaleGiappone.creaGeneraleGiappone();

			ListenerMenu.popolo.setVisible(false);

		}

	}

}

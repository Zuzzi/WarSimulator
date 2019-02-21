import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ListenerTruppeEuropa implements ActionListener {

	static GUIstrategia strategia;

	void addListener(JButton c) {
		c.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object sorgente = e.getSource();

		if (sorgente == GUItruppeEuropa.truppa1) {

			Globali.giocatore.truppe = "Cavalieri";

			strategia = new GUIstrategia();
			strategia.creaStrategia();

			ListenerGeneraleEuropa.truppeEuropa.setVisible(false);

		} else if (sorgente == GUItruppeEuropa.truppa2) {

			Globali.giocatore.truppe = "Balestrieri";

			strategia = new GUIstrategia();
			strategia.creaStrategia();

			ListenerGeneraleEuropa.truppeEuropa.setVisible(false);

		}

		else if (sorgente == GUItruppeEuropa.truppa3) {

			Globali.giocatore.truppe = "Catapulte";

			strategia = new GUIstrategia();
			strategia.creaStrategia();

			ListenerGeneraleEuropa.truppeEuropa.setVisible(false);

		} else if (sorgente == GUItruppeEuropa.truppa4) {

			Globali.giocatore.truppe = "Vichinghi";

			strategia = new GUIstrategia();
			strategia.creaStrategia();

			ListenerGeneraleEuropa.truppeEuropa.setVisible(false);

		}

	}

}

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ListenerTruppeGiappone implements ActionListener {

	static GUIstrategia strategia;

	void addListener(JButton c) {
		c.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object sorgente = e.getSource();

		if (sorgente == GUItruppeGiappone.truppa1) {

			Globali.giocatore.truppe = "Monaci guerrieri";

			strategia = new GUIstrategia();
			strategia.creaStrategia();

			ListenerGeneraleGiappone.truppeGiappone.setVisible(false);

		}

		else if (sorgente == GUItruppeGiappone.truppa2) {

			Globali.giocatore.truppe = "Ninja";

			strategia = new GUIstrategia();
			strategia.creaStrategia();

			ListenerGeneraleGiappone.truppeGiappone.setVisible(false);

		}

		else if (sorgente == GUItruppeGiappone.truppa3) {

			Globali.giocatore.truppe = "Samurai";

			strategia = new GUIstrategia();
			strategia.creaStrategia();

			ListenerGeneraleGiappone.truppeGiappone.setVisible(false);

		}

		else if (sorgente == GUItruppeGiappone.truppa4) {

			Globali.giocatore.truppe = "Arceri";

			strategia = new GUIstrategia();
			strategia.creaStrategia();

			ListenerGeneraleGiappone.truppeGiappone.setVisible(false);

		}

	}

}


public class Burattinaio {

	static void moveArmyGiocatore(String strategia) {

		GUIsimulazione.ok.setVisible(false);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		if (strategia.equals("attacco frontale")) {

			GUIsimulazione.esercitoGiocatore.alaSinistraY -= 50;
			GUIsimulazione.esercitoGiocatore.centroSinistraY -= 50;
			GUIsimulazione.esercitoGiocatore.centroDestraY -= 50;
			GUIsimulazione.esercitoGiocatore.alaDestraY -= 50;

			GUIsimulazione.esercitoGiocatore.repaint();
			GUIsimulazione.esercitoGiocatore.revalidate();

		}

		else if (strategia.equals("accerchiamento")) {

			GUIsimulazione.esercitoGiocatore.alaSinistraX -= 30;
			GUIsimulazione.esercitoGiocatore.alaDestraX += 30;
			GUIsimulazione.esercitoGiocatore.alaDestraY -= 65;
			GUIsimulazione.esercitoGiocatore.alaSinistraY -= 65;
			GUIsimulazione.esercitoGiocatore.centroSinistraY -= 10;
			GUIsimulazione.esercitoGiocatore.centroDestraY -= 10;

			GUIsimulazione.esercitoGiocatore.repaint();
			GUIsimulazione.esercitoGiocatore.revalidate();

		}

		else if (strategia.equals("tenere la posizione")) {

			GUIsimulazione.esercitoGiocatore.alaSinistraX -= 10;
			GUIsimulazione.esercitoGiocatore.centroSinistraX -= 5;
			GUIsimulazione.esercitoGiocatore.centroDestraX += 5;
			GUIsimulazione.esercitoGiocatore.alaDestraX += 10;

			GUIsimulazione.esercitoGiocatore.repaint();
			GUIsimulazione.esercitoGiocatore.revalidate();

		}

		else if (strategia.equals("difesa a quadrato")) {

			GUIsimulazione.esercitoGiocatore.alaSinistraY += 50;
			GUIsimulazione.esercitoGiocatore.alaDestraY += 50;

			GUIsimulazione.esercitoGiocatore.repaint();
			GUIsimulazione.esercitoGiocatore.revalidate();

		}

		else if (strategia.equals("attacco a cuneo")) {

			GUIsimulazione.esercitoGiocatore.centroSinistraY -= 65;
			GUIsimulazione.esercitoGiocatore.centroDestraY -= 65;
			GUIsimulazione.esercitoGiocatore.alaDestraY -= 20;
			GUIsimulazione.esercitoGiocatore.alaSinistraY -= 20;

			GUIsimulazione.esercitoGiocatore.repaint();
			GUIsimulazione.esercitoGiocatore.revalidate();

		}

		else if (strategia.equals("ritirata strategica")) {

			GUIsimulazione.esercitoGiocatore.setVisible(false);

		}

	}

	static void moveArmyAvversario(String strategia) {

		GUIsimulazione.ok.setVisible(false);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		if (strategia.equals("attacco frontale")) {

			GUIsimulazione.esercitoAvversario.alaSinistraY += 50;
			GUIsimulazione.esercitoAvversario.centroSinistraY += 50;
			GUIsimulazione.esercitoAvversario.centroDestraY += 50;
			GUIsimulazione.esercitoAvversario.alaDestraY += 50;

			GUIsimulazione.esercitoAvversario.repaint();
			GUIsimulazione.esercitoAvversario.revalidate();

		}

		else if (strategia.equals("accerchiamento")) {

			GUIsimulazione.esercitoAvversario.alaDestraX += 30;
			GUIsimulazione.esercitoAvversario.alaSinistraX -= 30;
			GUIsimulazione.esercitoAvversario.alaSinistraY += 65;
			GUIsimulazione.esercitoAvversario.alaDestraY += 65;
			GUIsimulazione.esercitoAvversario.centroSinistraY += 10;
			GUIsimulazione.esercitoAvversario.centroDestraY += 10;

			GUIsimulazione.esercitoAvversario.repaint();
			GUIsimulazione.esercitoAvversario.revalidate();

		}

		else if (strategia.equals("tenere la posizione")) {

			GUIsimulazione.esercitoAvversario.alaDestraX += 10;
			GUIsimulazione.esercitoAvversario.centroDestraX += 5;
			GUIsimulazione.esercitoAvversario.centroSinistraX -= 5;
			GUIsimulazione.esercitoAvversario.alaSinistraX -= 10;

			GUIsimulazione.esercitoAvversario.repaint();
			GUIsimulazione.esercitoAvversario.revalidate();

		}

		else if (strategia.equals("difesa a quadrato")) {

			GUIsimulazione.esercitoAvversario.alaSinistraY -= 50;
			GUIsimulazione.esercitoAvversario.alaDestraY -= 50;

			GUIsimulazione.esercitoAvversario.repaint();
			GUIsimulazione.esercitoAvversario.revalidate();

		}

		else if (strategia.equals("attacco a cuneo")) {

			GUIsimulazione.esercitoAvversario.centroSinistraY += 65;
			GUIsimulazione.esercitoAvversario.centroDestraY += 65;
			GUIsimulazione.esercitoAvversario.alaDestraY += 20;
			GUIsimulazione.esercitoAvversario.alaSinistraY += 20;

			GUIsimulazione.esercitoAvversario.repaint();
			GUIsimulazione.esercitoAvversario.revalidate();

		}

		else if (strategia.equals("ritirata strategica")) {

			GUIsimulazione.esercitoAvversario.setVisible(false);

		}

	}

}

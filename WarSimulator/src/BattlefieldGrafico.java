import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BattlefieldGrafico extends JPanel {

	String terreno;

	public BattlefieldGrafico(String pterreno) {

		terreno = pterreno;

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (terreno.equals("Pianura")) {
			Image sfondo = new ImageIcon(this.getClass().getResource("/pianura.jpg")).getImage();

			g.drawImage(sfondo, 0, 0, this);

		}

		else if (terreno.equals("Foresta")) {

			Image sfondo = new ImageIcon(this.getClass().getResource("/foresta.jpg")).getImage();

			g.drawImage(sfondo, 0, 0, this);

		}

		else if (terreno.equals("Palude")) {

			Image sfondo = new ImageIcon(this.getClass().getResource("/palude.jpg")).getImage();

			g.drawImage(sfondo, 0, 0, this);

		}

	}

}

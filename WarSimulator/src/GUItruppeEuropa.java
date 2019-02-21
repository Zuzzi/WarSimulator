import java.awt.*;

import javax.swing.*;

public class GUItruppeEuropa extends JFrame {

	static JButton truppa1;
	static JButton truppa2;
	static JButton truppa3;
	static JButton truppa4;

	JPanel Ctruppa;

	Knight knight;
	Crossbowman crossbowman;
	Viking viking;
	Catapulta catapulta;

	ListenerTruppeEuropa listener;

	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
	int fontSize = (int) Math.round(14.0 * screenRes / 72.0);

	Font font = new Font("serif", Font.PLAIN, fontSize);

	void creaTruppeEuropa() {

		truppa1 = new JButton("Cavalieri");
		truppa2 = new JButton("Balestrieri");
		truppa3 = new JButton("Catapulte");
		truppa4 = new JButton("Vichinghi");

		knight = new Knight();
		crossbowman = new Crossbowman();
		catapulta = new Catapulta();
		viking = new Viking();

		Ctruppa = new JPanel();
		listener = new ListenerTruppeEuropa();

		Ctruppa.setLayout(null);
		Ctruppa.setPreferredSize(new Dimension(490, 490));

		Ctruppa.add(truppa1);
		Ctruppa.add(truppa2);
		Ctruppa.add(truppa3);
		Ctruppa.add(truppa4);

		Ctruppa.add(knight);
		Ctruppa.add(crossbowman);
		Ctruppa.add(catapulta);
		Ctruppa.add(viking);

		truppa1.setBounds(20, 200, 200, 30);
		truppa2.setBounds(280, 200, 200, 30);
		truppa3.setBounds(20, 450, 200, 30);
		truppa4.setBounds(280, 450, 200, 30);

		knight.setBounds(0, 0, 250, 250);
		crossbowman.setBounds(250, 0, 250, 250);
		catapulta.setBounds(0, 250, 250, 250);
		viking.setBounds(250, 250, 250, 250);

		setContentPane(Ctruppa);
		pack();

		Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dimFinestra.width - getWidth()) / 2, (dimFinestra.height - getHeight()) / 2);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Truppe Europa");

		listener.addListener(truppa1);
		listener.addListener(truppa2);
		listener.addListener(truppa3);
		listener.addListener(truppa4);

	}

}
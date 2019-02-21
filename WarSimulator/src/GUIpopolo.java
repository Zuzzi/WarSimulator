import java.awt.*;

import javax.swing.*;

public class GUIpopolo extends JFrame {

	static JButton roma;
	static JButton giappone;
	static JButton europa;

	JPanel Cpopolo;

	Sun sole;
	Eagle aquila;
	Flag bandiera;

	ListenerPopolo listener;

	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
	int fontSize = (int) Math.round(14.0 * screenRes / 72.0);

	Font font = new Font("serif", Font.PLAIN, fontSize);

	void creaPopolo() {

		roma = new JButton("Antica  Roma");
		giappone = new JButton("Giappone  Feudale");
		europa = new JButton("Europa  Medievale");

		sole = new Sun();
		aquila = new Eagle();
		bandiera = new Flag();

		Cpopolo = new JPanel();
		listener = new ListenerPopolo();

		Cpopolo.setLayout(null);
		Cpopolo.setPreferredSize(new Dimension(740, 200));

		Cpopolo.add(roma);
		Cpopolo.add(giappone);
		Cpopolo.add(europa);
		Cpopolo.add(sole);
		Cpopolo.add(aquila);
		Cpopolo.add(bandiera);

		roma.setBounds(20, 170, 200, 30);
		europa.setBounds(280, 170, 200, 30);
		giappone.setBounds(530, 170, 200, 30);
		bandiera.setBounds(250, 0, 250, 250);
		aquila.setBounds(0, 0, 250, 250);
		sole.setBounds(500, 0, 250, 250);

		setContentPane(Cpopolo);
		pack();

		Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dimFinestra.width - getWidth()) / 2, (dimFinestra.height - getHeight()) / 2);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Popolo");

		listener.addListener(roma);
		listener.addListener(giappone);
		listener.addListener(europa);

		roma.setToolTipText("Una delle più moderne e potenti civiltà dell'antichità.");

	}

}

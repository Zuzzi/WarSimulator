
import java.awt.*;

import javax.swing.*;

public class GUIsalvataggio extends JFrame {

	static JButton ok;
	static JLabel etichetta;
	static JTextField nome;

	static JPanel Csalvataggio;

	ListenerSalvataggio listener;

	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
	int fontSize = (int) Math.round(14.0 * screenRes / 72.0);

	Font font = new Font("serif", Font.PLAIN, fontSize);

	void creaSalvataggio() {

		ok = new JButton("ok");
		etichetta = new JLabel("nome salvataggio:");
		nome = new JTextField();

		Csalvataggio = new JPanel();
		listener = new ListenerSalvataggio();

		Csalvataggio.setLayout(null);
		Csalvataggio.setPreferredSize(new Dimension(380, 180));

		Csalvataggio.add(ok);
		Csalvataggio.add(etichetta);
		Csalvataggio.add(nome);

		Csalvataggio.setBackground(Color.white);

		ok.setBounds(150, 140, 100, 30);
		etichetta.setBounds(10, 50, 200, 20);
		nome.setBounds(150, 50, 150, 30);

		nome.setDocument(new Limite(20));

		setContentPane(Csalvataggio);
		pack();

		Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dimFinestra.width - getWidth()) / 2, (dimFinestra.height - getHeight()) / 2);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Salvataggio");

		listener.addListener(ok);

	}

}
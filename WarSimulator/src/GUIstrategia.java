
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class GUIstrategia extends JFrame {

	static JRadioButton strategia1;
	static JRadioButton strategia2;
	static JRadioButton strategia3;
	static JRadioButton strategia4;
	static JRadioButton strategia5;
	static JRadioButton strategia6;

	static JButton avvia;
	static TextArea situazione;
	static ArrayList<JRadioButton> lista;

	JPanel Cstrategia;
	ListenerStrategia listener;

	static Grafico grafico;

	void creaStrategia() {

		Globali.avversario.random();
		Globali.battaglia.random();

		Cstrategia = new JPanel();
		avvia = new JButton("simulazione");
		listener = new ListenerStrategia();
		lista = new ArrayList<JRadioButton>();
		situazione = new TextArea();
		grafico = new Grafico(1);

		riempiLista();

		Cstrategia.setLayout(null);
		Cstrategia.setPreferredSize(new Dimension(500, 500));

		Cstrategia.add(avvia);
		Cstrategia.add(situazione);
		Cstrategia.add(grafico);

		Cstrategia.setBackground(Color.white);

		avvia.setBounds(150, 450, 200, 30);
		situazione.setBounds(0, 0, 528, 85);
		grafico.setBounds(200, 120, 250, 250);

		setContentPane(Cstrategia);
		pack();

		situazione.setText(" Il campo di battaglia è " + Globali.battaglia.terreno + " di " + Globali.battaglia.orario
				+ "." + "\n I nostri esploratori ci hanno informato che il nostro nemico" + "\n è il popolo "
				+ Globali.avversario.popolo + ", formato da truppe " + Globali.avversario.truppe
				+ "\n e guidati dal generale " + Globali.avversario.generale + ".");

		situazione.setEditable(false);
		situazione.setFocusable(false);
		situazione.setBackground(Color.white);

		Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dimFinestra.width - getWidth()) / 2, (dimFinestra.height - getHeight()) / 2);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Strategia");

		listener.addListener(avvia);

	}

	void riempiLista() {

		ButtonGroup group;

		group = new ButtonGroup();

		strategia1 = new JRadioButton("attacco frontale", true);
		strategia2 = new JRadioButton("accerchiamento", false);
		strategia3 = new JRadioButton("tenere la posizione", false);
		strategia4 = new JRadioButton("difesa a quadrato", false);
		strategia5 = new JRadioButton("attacco a cuneo", false);
		strategia6 = new JRadioButton("ritirata strategica", false);

		strategia1.setBackground(Color.white);
		strategia2.setBackground(Color.white);
		strategia3.setBackground(Color.white);
		strategia4.setBackground(Color.white);
		strategia5.setBackground(Color.white);
		strategia6.setBackground(Color.white);

		lista = new ArrayList<JRadioButton>();

		Cstrategia.add(strategia1);
		Cstrategia.add(strategia2);
		Cstrategia.add(strategia3);
		Cstrategia.add(strategia4);
		Cstrategia.add(strategia5);
		Cstrategia.add(strategia6);

		group.add(strategia1);
		group.add(strategia2);
		group.add(strategia3);
		group.add(strategia4);
		group.add(strategia5);
		group.add(strategia6);

		strategia1.setBounds(0, 100, 200, 50);
		strategia2.setBounds(0, 150, 200, 50);
		strategia3.setBounds(0, 200, 200, 50);
		strategia4.setBounds(0, 250, 200, 50);
		strategia5.setBounds(0, 300, 200, 50);
		strategia6.setBounds(0, 350, 200, 50);

		lista.add(strategia1);
		lista.add(strategia2);
		lista.add(strategia3);
		lista.add(strategia4);
		lista.add(strategia5);
		lista.add(strategia6);

		listener.addListener(strategia1);
		listener.addListener(strategia2);
		listener.addListener(strategia3);
		listener.addListener(strategia4);
		listener.addListener(strategia5);
		listener.addListener(strategia6);

	}

}

/*
 * 
 * import java.awt.*; import java.util.ArrayList;
 * 
 * import javax.swing.*;
 * 
 * 
 * public class GUIstrategia extends JFrame {
 * 
 * JRadioButton strategia1; JRadioButton strategia2; JRadioButton strategia3;
 * 
 * static JButton avvia;
 * 
 * 
 * static ArrayList <JRadioButton> lista;
 * 
 * private ButtonGroup group;
 * 
 * JPanel Cstrategia;
 * 
 * ListenerStrategia listener;
 * 
 * 
 * 
 * void creaStrategia () {
 * 
 * 
 * 
 * 
 * strategia1 = new JRadioButton("mantenere la posizione",true); strategia2 =
 * new JRadioButton("accerchiamento",false); strategia3 = new
 * JRadioButton("attacco frontale",false);
 * 
 * 
 * Cstrategia = new JPanel(); group = new ButtonGroup(); avvia = new
 * JButton("avvia simulazione");
 * 
 * listener = new ListenerStrategia();
 * 
 * lista = new ArrayList <JRadioButton> ();
 * 
 * 
 * 
 * Cstrategia.setLayout(null); Cstrategia.setPreferredSize(new Dimension(500,
 * 500));
 * 
 * Cstrategia.add(strategia1); Cstrategia.add(strategia2);
 * Cstrategia.add(strategia3); Cstrategia.add(avvia);
 * 
 * 
 * group.add(strategia1); group.add(strategia2); group.add(strategia3);
 * 
 * 
 * 
 * 
 * 
 * 
 * strategia1.setBounds(0,0,200,50); strategia2.setBounds(0,50,200,50);
 * strategia3.setBounds(0,100,200,50); avvia.setBounds(150,450,200,30);
 * 
 * 
 * 
 * 
 * 
 * 
 * lista.add(strategia1); lista.add(strategia2); lista.add(strategia3);
 * 
 * 
 * 
 * 
 * setContentPane(Cstrategia); pack();
 * 
 * 
 * Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
 * setLocation( (dimFinestra.width - getWidth())/2,(dimFinestra.height -
 * getHeight())/2 ); setResizable(false); setVisible(true);
 * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setTitle("Strategia");
 * 
 * 
 * listener.addListener(avvia);
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 */

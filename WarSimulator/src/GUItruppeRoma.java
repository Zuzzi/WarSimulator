import java.awt.*;

import javax.swing.*;


public class GUItruppeRoma extends JFrame {
	
	
	static JButton truppa1;
	static JButton truppa2;
	static JButton truppa3;
	static JButton truppa4;
	
	
	JPanel Ctruppa;
	
	Legionario legionario;
	Equites equites;
	Gladiator gladiator;
	Velites velites;
	
	ListenerTruppeRoma listener;
	
	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
	int fontSize = (int)Math.round(14.0 * screenRes / 72.0);
	
	Font font = new Font ("serif", Font.PLAIN, fontSize);
	
	
	void creaTruppeRoma() {
		
		truppa1 = new JButton("Legionari");
		truppa2 = new JButton("Equites");
		truppa3 = new JButton("Gladiatori");
		truppa4 = new JButton("Velites");
		
		
		legionario = new Legionario();
		equites = new Equites();
		gladiator = new Gladiator();
		velites = new Velites();
		
		
		Ctruppa = new JPanel();
	    listener = new ListenerTruppeRoma(); 
		
		
		
		Ctruppa.setLayout(null);
		Ctruppa.setPreferredSize(new Dimension(490, 490));
		
		Ctruppa.add(truppa1);
		Ctruppa.add(truppa2);
		Ctruppa.add(truppa3);
		Ctruppa.add(truppa4);
		
		Ctruppa.add(legionario);
		Ctruppa.add(equites);
		Ctruppa.add(gladiator);
		Ctruppa.add(velites);
		
		truppa1.setBounds(20,200,200,30);
		truppa2.setBounds(280,200,200,30);
		truppa3.setBounds(20,450,200,30);
		truppa4.setBounds(280,450,200,30);
		
		legionario.setBounds(0,0,250,250);
		equites.setBounds(250, 0, 250, 250);
		gladiator.setBounds(0,250,250,250);
		velites.setBounds(250,250,250,250);
		
		setContentPane(Ctruppa);
		pack();
		
		
		
		Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation( (dimFinestra.width - getWidth())/2,(dimFinestra.height - getHeight())/2 );
	    setResizable(false);  
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("Truppe Roma");
		
		listener.addListener(truppa1);
		listener.addListener(truppa2);
		listener.addListener(truppa3);
		listener.addListener(truppa4);
		
		
	}
	
	

}
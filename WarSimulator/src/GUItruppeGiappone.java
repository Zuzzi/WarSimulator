import java.awt.*;

import javax.swing.*;


public class GUItruppeGiappone extends JFrame {
	
	
	static JButton truppa1;
	static JButton truppa2;
	static JButton truppa3;
	static JButton truppa4;
	
	
	JPanel Ctruppa;
	
	Samurai samurai;
	Arcere arcere;
	Monk monk;
	Ninja ninja;
	
	ListenerTruppeGiappone listener;
	
	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
	int fontSize = (int)Math.round(14.0 * screenRes / 72.0);
	
	Font font = new Font ("serif", Font.PLAIN, fontSize);
	
	
	void creaTruppeGiappone() {
		
		truppa3 = new JButton("Samurai");
		truppa4 = new JButton("Arceri");
		truppa1 = new JButton("Monaci guerrieri");
		truppa2 = new JButton("Ninja");
		
		
		samurai = new Samurai();
		arcere = new Arcere();
		monk = new Monk();
		ninja = new Ninja();
		
		
		Ctruppa = new JPanel();
	    listener = new ListenerTruppeGiappone(); 
		
		
		
		Ctruppa.setLayout(null);
		Ctruppa.setPreferredSize(new Dimension(490, 490));
		
		Ctruppa.add(truppa1);
		Ctruppa.add(truppa2);
		Ctruppa.add(truppa3);
		Ctruppa.add(truppa4);
		
		Ctruppa.add(samurai);
		Ctruppa.add(arcere);
		Ctruppa.add(monk);
		Ctruppa.add(ninja);
		
		truppa1.setBounds(20,200,200,30);
		truppa2.setBounds(280,200,200,30);
		truppa3.setBounds(20,450,200,30);
		truppa4.setBounds(280,450,200,30);
		
		monk.setBounds(0,0,250,250);
		ninja.setBounds(250, 0, 250, 250);
		samurai.setBounds(0,250,250,250);
		arcere.setBounds(250,250,250,250);
		
		setContentPane(Ctruppa);
		pack();
		
		
		
		Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation( (dimFinestra.width - getWidth())/2,(dimFinestra.height - getHeight())/2 );
	    setResizable(false);  
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("Truppe Giappone");
		
		listener.addListener(truppa1);
		listener.addListener(truppa2);
		listener.addListener(truppa3);
		listener.addListener(truppa4);
		
	}
	
	

}
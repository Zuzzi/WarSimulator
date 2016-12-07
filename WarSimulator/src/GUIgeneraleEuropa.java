import java.awt.*;

import javax.swing.*;


public class GUIgeneraleEuropa extends JFrame {
	
	
	static JButton generale1;
	static JButton generale3;
	static JButton generale2;
	
	JPanel Cgenerale;
	
	Giovanna giovanna;
	Vlad vlad;
	Enrico enrico;
	
	ListenerGeneraleEuropa listener;
	
	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
	int fontSize = (int)Math.round(14.0 * screenRes / 72.0);
	
	Font font = new Font ("serif", Font.PLAIN, fontSize);
	
	
	void creaGeneraleEuropa() {
		
		generale1 = new JButton("Giovanna d'Arco");
		generale3 = new JButton("Enrico I di Sassonia");
		generale2 = new JButton("Vlad l'Impalatore");
		
		giovanna = new Giovanna();
		vlad = new Vlad();
		enrico = new Enrico();
		
		Cgenerale = new JPanel();
	    listener = new ListenerGeneraleEuropa(); 
		
		
		
		Cgenerale.setLayout(null);
		Cgenerale.setPreferredSize(new Dimension(740, 200));
		
		Cgenerale.add(generale1);
		Cgenerale.add(generale3);
		Cgenerale.add(generale2);
		
		Cgenerale.add(giovanna);
		Cgenerale.add(vlad);
		Cgenerale.add(enrico);
		
		generale1.setBounds(20,170,200,30);
		generale2.setBounds(280,170,200,30);
		generale3.setBounds(530,170,200,30);
		vlad.setBounds(250, 0, 250, 250);
		giovanna.setBounds(0,0,250,250);
		enrico.setBounds(500,0,250,250);
		
		setContentPane(Cgenerale);
		pack();
		
		
		
		Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation( (dimFinestra.width - getWidth())/2,(dimFinestra.height - getHeight())/2 );
	    setResizable(false);  
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("Generale Europa");
		
		listener.addListener(generale1);
		listener.addListener(generale3);
		listener.addListener(generale2);
		
	}
	
	

}
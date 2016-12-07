import java.awt.*;

import javax.swing.*;


public class GUIgeneraleRoma extends JFrame {
	
	
	static JButton generale1;
	static JButton generale3;
	static JButton generale2;
	
	JPanel Cgenerale;
	
	Spartaco spartaco;
	Scipione scipione;
	Cesare cesare;
	
	ListenerGeneraleRoma listener;
	
	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
	int fontSize = (int)Math.round(14.0 * screenRes / 72.0);
	
	Font font = new Font ("serif", Font.PLAIN, fontSize);
	
	
	void creaGeneraleRoma() {
		
		generale3 = new JButton("Spartaco");
		generale1 = new JButton("Giulio Cesare");
		generale2 = new JButton("Scipione l'Africano");
		
		spartaco = new Spartaco();
		scipione = new Scipione();
		cesare = new Cesare();
		
		Cgenerale = new JPanel();
		
	    listener = new ListenerGeneraleRoma(); 
		
		
		
		Cgenerale.setLayout(null);
		Cgenerale.setPreferredSize(new Dimension(740, 200));
		
		Cgenerale.add(generale1);
		Cgenerale.add(generale3);
		Cgenerale.add(generale2);
		
		Cgenerale.add(spartaco);
		Cgenerale.add(scipione);
		Cgenerale.add(cesare);
		
		generale1.setBounds(20,170,200,30);
		generale2.setBounds(280,170,200,30);
		generale3.setBounds(530,170,200,30);
		scipione.setBounds(250, 0, 250, 250);
		cesare.setBounds(0,0,250,250);
		spartaco.setBounds(500,0,250,250);
		
		setContentPane(Cgenerale);
		pack();
		
		
		
		Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation( (dimFinestra.width - getWidth())/2,(dimFinestra.height - getHeight())/2 );
	    setResizable(false);  
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("Generale Roma");
		
		listener.addListener(generale1);
		listener.addListener(generale3);
		listener.addListener(generale2);
		
	}
	
	

}

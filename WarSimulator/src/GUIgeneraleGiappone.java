import java.awt.*;

import javax.swing.*;


public class GUIgeneraleGiappone extends JFrame {
	
	
	static JButton generale1;
	static JButton generale3;
	static JButton generale2;
	
	JPanel Cgenerale;
	
	Musashi musashi;
	Tametomo tametomo;
	Goemon goemon;
	
	ListenerGeneraleGiappone listener;
	
	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
	int fontSize = (int)Math.round(14.0 * screenRes / 72.0);
	
	Font font = new Font ("serif", Font.PLAIN, fontSize);
	
	
	void creaGeneraleGiappone() {
		
		generale1 = new JButton("Miyamoto Musashi");
		generale2 = new JButton("Minamoto Tametomo");
		generale3 = new JButton("Ishikawa Goemon");
		
		
		musashi = new Musashi();
		tametomo = new Tametomo();
		goemon = new Goemon();
		
		Cgenerale = new JPanel();
	    listener = new ListenerGeneraleGiappone(); 
		
		
		
		Cgenerale.setLayout(null);
		Cgenerale.setPreferredSize(new Dimension(740, 200));
		
		Cgenerale.add(generale1);
		Cgenerale.add(generale3);
		Cgenerale.add(generale2);
		
		Cgenerale.add(musashi);
		Cgenerale.add(tametomo);
		Cgenerale.add(goemon);
		
		generale1.setBounds(20,170,200,30);
		generale2.setBounds(280,170,200,30);
		generale3.setBounds(530,170,200,30);
		
		musashi.setBounds(0,0,250,250);
		tametomo.setBounds(250, 0, 250, 250);
		goemon.setBounds(500,0,250,250);
		
		setContentPane(Cgenerale);
		pack();
		
		
		
		Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation( (dimFinestra.width - getWidth())/2,(dimFinestra.height - getHeight())/2 );
	    setResizable(false);  
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("Generale Giappone");
		
		listener.addListener(generale1);
		listener.addListener(generale3);
		listener.addListener(generale2);
		
	}
	
	

}
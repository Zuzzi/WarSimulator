

import java.awt.*;

import javax.swing.*;

public class GUImenu extends JFrame {
	
	static  JButton nuova;
	static  JButton statistiche;
	static  JButton esci;
	static Logo logo;
	
	static JPanel Cmenu;
	
	ListenerMenu listener;
	
	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
	int fontSize = (int)Math.round(14.0 * screenRes / 72.0);
	
	Font font = new Font ("serif", Font.PLAIN, fontSize);
	
	
	
	
	
	void creaMenu () {
		
		nuova = new JButton ("combatti!");
		statistiche = new JButton("statistiche");
		esci = new JButton("esci");
		logo = new Logo();
	
		Cmenu = new JPanel();
		listener = new ListenerMenu();
		
		
		Cmenu.setLayout(null);
		Cmenu.setPreferredSize(new Dimension(380, 180));
		
		Cmenu.add(nuova);
		Cmenu.add(statistiche);
		Cmenu.add(esci);
		Cmenu.add(logo);
		
		nuova.setBounds(10,140,100,30);
		statistiche.setBounds(143,140,100,30);
		esci.setBounds(275,140,100,30);
		logo.setBounds(0,0,390,200);
		
		setContentPane(Cmenu);
		pack();
		
		Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation( (dimFinestra.width - getWidth())/2,(dimFinestra.height - getHeight())/2 );
	    setResizable(false);  
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("Menu");
		
		
	    listener.addListener(nuova);
	    listener.addListener(statistiche);
	    listener.addListener(esci);
	    
	    
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class GUIsimulazione extends JFrame  {
	
	
	
	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
    int fontSize = (int)Math.round(14.0 * screenRes / 72.0);
  
    
    
    Font font = new Font("serif", Font.PLAIN, fontSize-5);
    
    
    
    static ArmyGrafico esercitoGiocatore;
    static ArmyGrafico esercitoAvversario;
    static JButton ok;
    
    static BattlefieldGrafico sfondo;
    
    ListenerSimulazione listener;
    
    static Container Csimulazione;
    
    
    
 
    
    
    
    void creaSimulazione () {
    	
    	
    	
    	
    	//esercitoGiocatore = new ArmyGrafico("blu", 0, 50, 60, 50, 120, 50, 180, 50);
    	//esercitoAvversario = new ArmyGrafico("rosso", 0, 50, 60, 50, 120, 50, 180, 50);
    	
    	
    	esercitoGiocatore = new ArmyGrafico("blu", 80, 75, 140, 75, 200, 75, 260, 75);
    	esercitoAvversario = new ArmyGrafico("rosso", 80, 50, 140, 50, 200, 50, 260, 50);
    	
    	
    	sfondo = new BattlefieldGrafico(Globali.battaglia.terreno);
    	Csimulazione = new Container();
    	ok = new JButton("start");
    	listener = new ListenerSimulazione();
    	
    	
    	Csimulazione.setBackground(Color.white);
    	
    	esercitoGiocatore.setBackground(Color.white);
    	esercitoAvversario.setBackground(Color.white);
    	
    	
    	Csimulazione.setLayout(null);
	    Csimulazione.setPreferredSize( new Dimension(490,490) );
	    Csimulazione.add(esercitoGiocatore);
	    Csimulazione.add(esercitoAvversario);
	    Csimulazione.add(ok);
	    Csimulazione.add(sfondo);
	    
	    
	    
	    
	    
	    sfondo.setBounds(0,0,500,500);
	    //esercitoGiocatore.setBounds(140,300,300,100);
	    //esercitoAvversario.setBounds(140,50,300,100);
	    
	    
	    esercitoGiocatore.setBounds(50,270,400,200);
	    esercitoAvversario.setBounds(50,50,400,200);
	    ok.setBounds(200, 440, 100, 30);
	    
	    
	    
	    
	    
	    
	    
	    
	    setContentPane(Csimulazione); 
	    pack();
	    Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation( (dimFinestra.width -  getWidth())/2,(dimFinestra.height -  getHeight())/2 );
	    setResizable(false);  
	    setVisible(true);
	    setTitle("Simulazione");
	    
	    
	   
	    
	    listener.addListener(ok);
	    

    	
    	
   
    	
    	
    	
    	
    }
    
    
    
	
	
	
	
	
	

}

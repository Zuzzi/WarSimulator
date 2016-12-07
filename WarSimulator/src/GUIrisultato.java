
import java.awt.*;

import javax.swing.*;

public class GUIrisultato extends JFrame {
	
	static  JButton menu;
	static  JButton salva;
	static Sensei sensei;
	static JLabel esito;
	static TextArea advice;
	
	
	static JPanel Crisultato;
	
	ListenerRisultato listener;
	
	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
	int fontSize = (int)Math.round(14.0 * screenRes / 72.0);
	
	Font font = new Font ("serif", Font.PLAIN, fontSize);
	
	
	
	
	
	void creaRisultato () {
		
		String appoggio = new String();
		if (Globali.giocatore.probabilit‡Vittoria > Globali.avversario.probabilit‡Vittoria){
			appoggio = "V I T T O R I A !";
			Globali.vincitore = 1;
			}
		
		else if (Globali.giocatore.probabilit‡Vittoria < Globali.avversario.probabilit‡Vittoria){
			appoggio = "S C O N F I T T A !";
			Globali.vincitore = 2;
		}
		else {
			appoggio = "P A R E G G I O !";
			Globali.vincitore = 0;
		}
		
		menu = new JButton ("torna al men˘");
		salva = new JButton("salva risultato");
		esito = new JLabel(appoggio);
		sensei = new Sensei();
		advice = new TextArea("Sun-Tzu disse:\n\n" + SunTzu.parla());
	

		Crisultato = new JPanel();
		
		listener = new ListenerRisultato();
		
		
		Crisultato.setLayout(null);
		Crisultato.setPreferredSize(new Dimension(380, 300));
		Crisultato.setBackground(Color.white);
		
		advice.setEditable(false);
		advice.setFocusable(false);
		advice.setBackground(Color.white);
		
		Crisultato.add(menu);
		Crisultato.add(salva);
		Crisultato.add(sensei);
		Crisultato.add(esito);
		Crisultato.add(advice);
		
		
		menu.setBounds(20,250,150,30);
		salva.setBounds(220,250,150,30);
		sensei.setBounds(0,0,160,300);
		esito.setBounds(230,0,100,50);
		advice.setBounds(170,50,220,150);
		
		
		setContentPane(Crisultato);
		pack();
		
		Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation( (dimFinestra.width - 400),5 );
	    setResizable(false);  
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("Risultato");
		

	    listener.addListener(menu);
	    listener.addListener(salva);
	   
	    

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

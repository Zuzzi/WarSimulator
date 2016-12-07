import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class ListenerGeneraleEuropa implements ActionListener{
	
	
	static GUItruppeEuropa truppeEuropa;
	
	
	
	
	void addListener(JButton c){
		c.addActionListener(this);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object sorgente = e.getSource();
		
		

		
		truppeEuropa = new GUItruppeEuropa();

		
		
		
		
		if (sorgente == GUIgeneraleEuropa.generale1) {
			
			
			Globali.giocatore.generale = "Giovanna d'Arco";
			
			
			ListenerPopolo.generaleEuropa.setVisible(false);
			
			

			truppeEuropa.creaTruppeEuropa();
			
			
			
		}
		
		
		else if (sorgente == GUIgeneraleEuropa.generale2) {
			
			Globali.giocatore.generale = "Vlad l'Impalatore";
			
			ListenerPopolo.generaleEuropa.setVisible(false);
			
			truppeEuropa.creaTruppeEuropa();
			
			
		}
		
		
		
		else if (sorgente == GUIgeneraleEuropa.generale3) {
			
			Globali.giocatore.generale = "Enrico I di Sassonia";
			
			ListenerPopolo.generaleEuropa.setVisible(false);
			
			truppeEuropa.creaTruppeEuropa();
			
		}
		
		
	}
	
	

	
	
	
	
	

}

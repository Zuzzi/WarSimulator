import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class ListenerGeneraleRoma implements ActionListener{
	
	
	static GUItruppeRoma truppeRoma;
	
	
	
	
	void addListener(JButton c){
		c.addActionListener(this);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object sorgente = e.getSource();
		
		

		
		truppeRoma = new GUItruppeRoma();

		
		
		
		
		if (sorgente == GUIgeneraleRoma.generale1) {
			
			Globali.giocatore.generale = "Giulio Cesare";
			
			
			ListenerPopolo.generaleRoma.setVisible(false);
			
			

			truppeRoma.creaTruppeRoma();
			
			
			
		}
		
		
		else if (sorgente == GUIgeneraleRoma.generale2) {
			
			Globali.giocatore.generale = "Scipione l'Africano";
			
			ListenerPopolo.generaleRoma.setVisible(false);
			
			truppeRoma.creaTruppeRoma();
			
			
		}
		
		
		
		else if (sorgente == GUIgeneraleRoma.generale3) {
			
			
			Globali.giocatore.generale = "Spartaco";
			
			ListenerPopolo.generaleRoma.setVisible(false);
			
			truppeRoma.creaTruppeRoma();
			
		}
		
		
	}
	
	

	
	
	
	
	

}

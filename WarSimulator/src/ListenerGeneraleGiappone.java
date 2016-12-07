import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class ListenerGeneraleGiappone implements ActionListener{
	
	
	static GUItruppeGiappone truppeGiappone;
	
	
	
	
	void addListener(JButton c){
		c.addActionListener(this);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object sorgente = e.getSource();
		
		

		
		truppeGiappone = new GUItruppeGiappone();

		
		
		
		
		if (sorgente == GUIgeneraleGiappone.generale1) {
			
			Globali.giocatore.generale = "Miyamoto Musashi";
			
			
			ListenerPopolo.generaleGiappone.setVisible(false);
			
			

			truppeGiappone.creaTruppeGiappone();
			
			
			
		}
		
		
		else if (sorgente == GUIgeneraleGiappone.generale2) {
			
			Globali.giocatore.generale = "Minamoto Tametomo";
			
			ListenerPopolo.generaleGiappone.setVisible(false);
			
			truppeGiappone.creaTruppeGiappone();
			
			
		}
		
		
		
		else if (sorgente == GUIgeneraleGiappone.generale3) {
			
			Globali.giocatore.generale = "Ishikawa Goemon";
			
			ListenerPopolo.generaleGiappone.setVisible(false);
			
			truppeGiappone.creaTruppeGiappone();
			
		}
		
		
	}
	
	

	
	
	
	
	

}

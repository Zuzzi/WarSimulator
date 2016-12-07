import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class ListenerSimulazione implements ActionListener {
	
	
	
	static GUIrisultato risultato;
	
	
	
	
	void addListener(JButton c){
		c.addActionListener(this);
	}
	
	

	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object sorgente = e.getSource();
		
		if (sorgente == GUIsimulazione.ok) {
			
			
			Globali.avversario.strategia = AI.decidi(Globali.giocatore.truppe, Globali.avversario.truppe);
			
			
			
			Burattinaio.moveArmyGiocatore(Globali.giocatore.strategia);
			
			Burattinaio.moveArmyAvversario(Globali.avversario.strategia);
			
			
			
			SimulatorEngineSTARTER.starter (Globali.giocatore, Globali.avversario, Globali.battaglia);
			
			
			
			risultato = new GUIrisultato();
			risultato.creaRisultato();
		
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	   
		
	}
	
	
	
	
	
	

	
	

}


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ListenerTruppeRoma implements ActionListener {
	
	static GUIstrategia strategia;
	
	
	
	void addListener(JButton c){
		c.addActionListener(this);
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object sorgente = e.getSource();
	
		
		
		if (sorgente == GUItruppeRoma.truppa1){
			
			Globali.giocatore.truppe = "Legionari";
			
			
			strategia = new GUIstrategia();
			strategia.creaStrategia();
			
			
			ListenerGeneraleRoma.truppeRoma.setVisible(false);
			
			
			
			
			
			
		}
		
		
		else if (sorgente == GUItruppeRoma.truppa2){
			
			Globali.giocatore.truppe = "Equites";
			
			strategia = new GUIstrategia();
			strategia.creaStrategia();
			
			ListenerGeneraleRoma.truppeRoma.setVisible(false);
			
			
			
			
			
			
		}
		else if (sorgente == GUItruppeRoma.truppa3){
			
			Globali.giocatore.truppe = "Gladiatori";
			
			strategia = new GUIstrategia();
			strategia.creaStrategia();
			
			ListenerGeneraleRoma.truppeRoma.setVisible(false);
			
			
			
			
		}
		else if (sorgente == GUItruppeRoma.truppa4){
			
			Globali.giocatore.truppe = "Velites";
			
			strategia = new GUIstrategia();
			strategia.creaStrategia();
			
			
			ListenerGeneraleRoma.truppeRoma.setVisible(false);
			
			
		
		}
	}

}

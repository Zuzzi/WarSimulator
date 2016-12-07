
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

public class ListenerMenu implements ActionListener{

	
	
	
	
	static GUIpopolo popolo;
	
	static GUIstatistiche statistiche = new GUIstatistiche();
	
	
	
	
	void addListener(JButton c){
		c.addActionListener(this);
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object sorgente = e.getSource();
		
		
		
		if (sorgente == GUImenu.nuova) {
			
			popolo = new GUIpopolo();
			popolo.creaPopolo();
			
			WarSimulator.menu.setVisible(false);
			
			
			if (statistiche.isVisible()) statistiche.setVisible(false);
			
			
		}
		
		
		
		else if (sorgente == GUImenu.statistiche) {
			
			
			
			statistiche.creaStatistiche();
			
			
			
			
		}
		
		
		else if (sorgente == GUImenu.esci) {
			
			System.exit(0);
			
		}
		
	}
	
	
	
	
	void infoBox(String infoMessage, String location){
		JOptionPane.showMessageDialog(null, infoMessage, "" + location, JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	

}

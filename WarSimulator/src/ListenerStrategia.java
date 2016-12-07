import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class ListenerStrategia implements ActionListener {
	
	
	
	static GUIsimulazione simulazione;
	
	
	
	void addListener(JButton c){
		c.addActionListener(this);
	}
	
	
	
	void addListener(JRadioButton c){
		c.addActionListener(this);
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object sorgente = e.getSource();
		
		if (sorgente == GUIstrategia.avvia) {
			
			
			
			
			
			
			int k = 0;
			
			
			for (int i = 0; !GUIstrategia.lista.get(i).isSelected(); i++) k++;
			
			Globali.giocatore.strategia = GUIstrategia.lista.get(k).getText();
			
			
			
			
			
			simulazione = new GUIsimulazione();
			simulazione.creaSimulazione();
			
			
			
			if (Globali.giocatore.popolo.equals("Roma")) ListenerTruppeRoma.strategia.setVisible(false);
			else if (Globali.giocatore.popolo.equals("Europa")) ListenerTruppeEuropa.strategia.setVisible(false);
			else if (Globali.giocatore.popolo.equals("Giappone")) ListenerTruppeGiappone.strategia.setVisible(false);
			
			
			
			
			
			
		}
		
		
		
		
		else if (sorgente == GUIstrategia.strategia1) {
			
			
			GUIstrategia.grafico.setStrategia(1);
			GUIstrategia.grafico.repaint();
			
			
			
		}
		
		
		else if (sorgente == GUIstrategia.strategia2) {
			
			
			GUIstrategia.grafico.setStrategia(2);
			GUIstrategia.grafico.repaint();
			
		}
		
		else if (sorgente == GUIstrategia.strategia3) {
			
			
			
			GUIstrategia.grafico.setStrategia(3);
			GUIstrategia.grafico.repaint();
			
			
		}
		
		
		else if (sorgente == GUIstrategia.strategia4) {
			
			
			
			GUIstrategia.grafico.setStrategia(4);
			GUIstrategia.grafico.repaint();
			
			
			
		}
		
		
		else if (sorgente == GUIstrategia.strategia5) {
			
			
			GUIstrategia.grafico.setStrategia(5);
			GUIstrategia.grafico.repaint();	
			
			
		}
		
		
		
		else if (sorgente == GUIstrategia.strategia6) {
			
			
			
			GUIstrategia.grafico.setStrategia(6);
			GUIstrategia.grafico.repaint();	
			
		}
		
		
		
		
		
		
		
		
	   
		
	}
	
	
	
	
	
	
	
	void infoBox(String infoMessage, String location){
		JOptionPane.showMessageDialog(null, infoMessage, "" + location, JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
	

}
